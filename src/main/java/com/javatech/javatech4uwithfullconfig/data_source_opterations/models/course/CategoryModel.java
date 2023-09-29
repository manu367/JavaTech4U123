package com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CategoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoryname;

    @OneToMany(mappedBy = "categoryModel")
    private List<CourseModel> courseModels;

    public CategoryModel() {
    }

    public CategoryModel(String categoryname, List<CourseModel> courseModels) {
        this.categoryname = categoryname;
        this.courseModels = courseModels;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public List<CourseModel> getCourseModels() {
        return courseModels;
    }

    public void setCourseModels(List<CourseModel> courseModels) {
        this.courseModels = courseModels;
    }
}
