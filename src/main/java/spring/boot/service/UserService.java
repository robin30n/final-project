package spring.boot.service;

import spring.boot.dto.MovieDTO;
import spring.boot.model.User;
import spring.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);
        if (user!=null){
            return user;
        }else {
            throw new UsernameNotFoundException("User not found");
        }
    }

    public User addUser(User user){
        if (userRepository.findByEmail(user.getEmail())==null){
           return userRepository.save(user);
        }
        else return null;
    }

    public User update(String oldPassword,String newPassword){
        User user = getCurrentUser();

        if (passwordEncoder.matches(oldPassword,user.getPassword())){
            user.setPassword(passwordEncoder.encode(newPassword));
            return userRepository.save(user);
        }
        return null;
    }

    public User getCurrentUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)){
            User user = (User) authentication.getPrincipal();
            if (user!=null){
                return user;
            }
        }
        return null;
    }

    public User getUser(String email){
        return userRepository.findByEmail(email);
    }
}
