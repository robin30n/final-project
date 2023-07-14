package spring.boot.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping(value = "admin-page")
    public String adminPanel(Model model){
        return "admin-page";
    }
}
