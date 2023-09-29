package com.javatech.javatech4uwithfullconfig.admin.courses;

import com.javatech.javatech4uwithfullconfig.AllObjects;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.CategoryModel;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.CourseModel;
import com.javatech.javatech4uwithfullconfig.util.img_saver.ImageSaver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Controller
public class CourseController {

    @Autowired
    AllObjects allObjects;
    @Value("${project.upload-dir}")
    String fullpath;


    @GetMapping("/admin/courses")
    public String adminCourses(Model model) {
        model.addAttribute("courses",allObjects.courseModelService.findAll());
        return "admin/courses";
    }

    @PostMapping("/admin/addcourses")
    public String addCourse(@RequestParam String coursename, @RequestParam String description, @RequestParam("file") MultipartFile file) {
        if(coursename!=null&& description!=null && file.getOriginalFilename()!=null){
            long i=1;
            String uploadImage=ImageSaver.uploadImage(file,fullpath);
            String courselink="/"+coursename.replace(" ","-");
            CourseModel courseModel = new CourseModel(coursename,uploadImage,courselink,description,new Date(),new Date());
            allObjects.courseModelService.save(courseModel);
        }
        return "redirect:/admin/courses";
    }


    @PostMapping("/admin/deletecourses")
    @ResponseBody
    public String deleteCourse(@RequestParam("id") String id) {
        allObjects.courseModelService.delete(Long.parseLong(id));
        return "succefully deleted";
    }

    @PostMapping("/admin/updatecoursescategory")
    @ResponseBody
    public String updateCourseCategory(@RequestParam("courseid") String courseid,
                                       @RequestParam("categoryname") String categoryname,
                                       @RequestParam("categoryid") String categoryid) {

        // get the category by id
        CategoryModel categoryModel=allObjects.categoryService.getCategoryById(Long.parseLong(categoryid));
        // set the catgory to course
        CourseModel courseModel=allObjects.courseModelService.findById(Long.parseLong(courseid));
        courseModel.setCategoryModel(categoryModel);
        System.out.println(courseModel);

        // update the category
        allObjects.categoryService.updateCategory(categoryModel.getId(),courseModel);
        // update the course
       allObjects.courseModelService.update(courseModel,courseModel.getId());
        return "ho gya update";
    }





    @GetMapping("/admin/coursescategory")
    public String adminCoursescategory(Model model) {
        model.addAttribute("catgeory",allObjects.categoryService.getAllCategories());
        model.addAttribute("courses",allObjects.courseModelService.findAll());
        return "admin/courses_category";
    }

    @GetMapping("/admin/updatecategory/{id}")
    public String updateCategory(@ModelAttribute CourseModel courseModel,@ModelAttribute CategoryModel categoryModel)
    {
        return "admin/update_category";
    }
}
