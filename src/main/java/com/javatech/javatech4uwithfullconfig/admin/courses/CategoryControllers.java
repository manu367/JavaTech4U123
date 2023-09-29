package com.javatech.javatech4uwithfullconfig.admin.courses;

import com.javatech.javatech4uwithfullconfig.AllObjects;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.CategoryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryControllers {
    @Autowired
    AllObjects allObjects;

    @GetMapping("/admin/courses/category/add")
    public CategoryModel categoryAdd(@RequestParam String id,@RequestParam String catgeoryname) {
        if(catgeoryname!=null){
            Long i=Long.parseLong(id);
            CategoryModel model=allObjects.categoryService.addCategory(new CategoryModel(catgeoryname,null));
            return model;
        }
        return null;
    }




    @GetMapping("/admin/courses/category/get")
    public List<CategoryModel> categoryGet() {
        return allObjects.categoryService.getAllCategories();
    }
}
