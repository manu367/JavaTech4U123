package com.javatech.javatech4uwithfullconfig.home;

import com.javatech.javatech4uwithfullconfig.AllObjects;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.CourseModel;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.Lessons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BlogCourseControllers {

    @Autowired
    AllObjects allObjects;

    @GetMapping("/courses")
    public String courses(Model model){
        model.addAttribute("category",allObjects.categoryService.getAllCategories());
        return "user/courses";
    }

    @GetMapping("coursename/{coursename}")
    public String blog(@PathVariable("coursename") String coursename,Model model){
        CourseModel courseModel =allObjects.courseModelService.findByCourseName(coursename);
        if(courseModel!=null){
            model.addAttribute("course",courseModel);
            model.addAttribute("lessions",courseModel.getLessons());
        }else{
            System.out.println("Course Not Found"+courseModel);
        }
        System.out.println(coursename);
        return "user/course/coursecontent";
    }












    @GetMapping("/videocourse")
    @ResponseBody
    public String videocourse(){
        return "IN Progress";
    }

    @GetMapping("/search")
    @ResponseBody
    public String search(){
        return null;
    }


}
