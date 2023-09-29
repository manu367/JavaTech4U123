package com.javatech.javatech4uwithfullconfig.data_source_opterations.services.courses;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.CourseModel;

import java.util.List;

public interface CourseModelService {

    CourseModel save(CourseModel courseModel);
    CourseModel update(CourseModel courseModel,long id);
    CourseModel delete(long id);
    CourseModel findById(long id);

    List<CourseModel> findAll();

    CourseModel findByCourseName(String courseName);

}
