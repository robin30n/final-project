package spring.boot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.boot.model.User;
import spring.boot.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserRestController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @DeleteMapping
    public void deleteUsers(@RequestBody String email){
        User user = userRepository.findByEmail(email);
        if (user.isActive()) {
            user.setActive(false);
            userRepository.save(user);
        }
        else {
            user.setActive(true);
            userRepository.save(user);
        }
    }

}
