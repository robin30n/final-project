package spring.boot.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @PreAuthorize("hasAnyRole('ROLE_USER')")
    @GetMapping(value = "user-favorites")
    public String adminPanel(Model model){
        return "favorites";
    }
}
