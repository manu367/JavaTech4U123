package com.javatech.javatech4uwithfullconfig.data_source_opterations.services.courses;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.CategoryModel;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.CourseModel;

import java.util.List;

public interface CategoryService {
    CategoryModel getCategoryById(long id);

    CategoryModel addCategory(CategoryModel categoryModel);

    CategoryModel updateCategory( long id, CourseModel courseModel);

    void deleteCategory(long id);

    List<CategoryModel> getAllCategories();
}
