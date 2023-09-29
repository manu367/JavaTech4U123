package com.javatech.javatech4uwithfullconfig.data_source_opterations.services.courses;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.CourseModel;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.Lessons;

import java.util.List;

public interface LessionsService {
    Lessons save(Lessons lessons);
    Lessons update(Lessons lessons,long id);
    Lessons delete(long id);
    Lessons findById(long id);

    List<Lessons> findAll();

    List<Lessons> findByCourseName(CourseModel courseName);

    Lessons findByName(String name);
}
