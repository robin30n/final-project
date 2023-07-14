package spring.boot.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import spring.boot.dto.MovieDTO;
import spring.boot.model.Movie;
import spring.boot.model.User;
import spring.boot.service.MovieService;
import spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class HomeController {

    @Autowired
    UserService userService;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    MovieService movieService;

    @GetMapping(value = "/")
    public String indexpage() {
        return "main-page";
    }

    @GetMapping(value = "/sign-in-page")
    public String signInPage() {
        return "sign-in";
    }

    @GetMapping(value = "/sign-up-page")
    public String signUpPage() {
        return "sign-up";
    }

    @PostMapping(value = "/sign-up-page")
    public String toSignUp(User user, @RequestParam(name = "repeat-password") String repPassword) {
        User us = user;
        if (us.getPassword().equals(repPassword)) {
            us.setPassword(passwordEncoder.encode(us.getPassword()));

            if (userService.addUser(us) != null) {
                return "redirect:/sign-up-page?success";
            }

            else return "redirect:/sign-up-page?passwordError";

        } else return "redirect:/sign-up-page?password_same_error";
    }

    @GetMapping(value = "/update-password")
    public String updatePassword() {
        return "update-password";
    }

    @PreAuthorize("isAuthenticated()")
    @PostMapping(value = "/to-update-password")
    public String updatePassword(@RequestParam(name = "oldPassword") String oldPassword,
                                 @RequestParam(name = "newPassword") String newPassword,
                                 @RequestParam(name = "repeatNewPassword") String repeatNewPassword) {
        if (newPassword.equals(repeatNewPassword)) {

            User user = userService.update(oldPassword,newPassword);

            if (user != null) {
                return "redirect:/update-password?success";
            }

            else return "redirect:/update-password?old_password_error";

        } else return "redirect:/update-password?password_mismatch";
    }
    @PreAuthorize("isAuthenticated()")
    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }

    @GetMapping("/actors")
    public String actorsPage() {
        return "actors";
    }



}
