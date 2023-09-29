package com.javatech.javatech4uwithfullconfig.admin.message;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageControllers {
    @GetMapping("/admin/message")
    public String message() {
        return "admin/message";
    }
}
