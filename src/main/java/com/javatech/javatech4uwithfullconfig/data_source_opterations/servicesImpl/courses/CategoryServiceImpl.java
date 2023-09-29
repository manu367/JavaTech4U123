package com.javatech.javatech4uwithfullconfig.data_source_opterations.servicesImpl.courses;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.CategoryModel;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.CourseModel;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.repo.courserepo.CategoryRepo;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.services.courses.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public CategoryModel getCategoryById(long id) {
        return categoryRepo.findById(id).get();
    }

    @Override
    public CategoryModel addCategory(CategoryModel categoryModel) {
        return categoryRepo.save(categoryModel);
    }

    @Override
    public CategoryModel updateCategory(long categoryid, CourseModel courseModel) {
        CategoryModel category =categoryRepo.findById(categoryid).orElse(null);
        if(category!=null){
            List<CourseModel> courseModels = category.getCourseModels();
            courseModels.add(courseModel);
            category.setCourseModels(courseModels);
            return categoryRepo.save(category);
        }
        return null;
    }

    @Override
    public void deleteCategory(long id) {
        Optional<CategoryModel> optionalCategoryModel =categoryRepo.findById(id);
        if(optionalCategoryModel.isPresent()){
            categoryRepo.delete(optionalCategoryModel.get());
        }
    }

    @Override
    public List<CategoryModel> getAllCategories() {
        return categoryRepo.findAll();
    }
}
