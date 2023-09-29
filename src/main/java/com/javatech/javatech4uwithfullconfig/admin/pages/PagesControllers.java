package com.javatech.javatech4uwithfullconfig.admin.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesControllers {
    @GetMapping("/admin/pages")
    public String pages(){
        return "admin/pages_all";
    }

    @GetMapping("/admin/add/pages")
    public String addpages(){
        return "admin/pages_add";
    }

    @GetMapping("/admin/category/pages")
    public String addpagescategory(){
        return "admin/pages_category";
    }
}
