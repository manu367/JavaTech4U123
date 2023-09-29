package com.javatech.javatech4uwithfullconfig.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    @GetMapping("/admin")
    public String adminHome(Model model) {
        model.addAttribute("title", "Admin Home\t");
        return "admin/admin";
    }
}
