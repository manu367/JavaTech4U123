package com.javatech.javatech4uwithfullconfig.admin.projects;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ProjectController {

    @GetMapping("/admin/projects")
    public String projects() {
        return "admin/projects";
    }

    @GetMapping("/admin/addprojects")
    public String addprojects() {
        return "admin/Projects_add";
    }


    @GetMapping("/admin/manu")
    @ResponseBody
    public String addprojectsmanu(@RequestParam MultipartFile file) {
        return "hello bro"+ file.getName();
    }

    @GetMapping("/admin/categoryprojects")
    public String categoryprojects() {
        return "admin/project_category";
    }
}
