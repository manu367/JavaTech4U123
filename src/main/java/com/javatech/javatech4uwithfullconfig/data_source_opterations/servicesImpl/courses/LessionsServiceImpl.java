package com.javatech.javatech4uwithfullconfig.data_source_opterations.servicesImpl.courses;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.CourseModel;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.Lessons;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.repo.courserepo.LessionsRepo;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.services.courses.LessionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessionsServiceImpl implements LessionsService {
    @Autowired
    LessionsRepo lessionsRepo;

    @Override
    public Lessons save(Lessons lessons) {
        return lessionsRepo.save(lessons);
    }

    @Override
    public Lessons update(Lessons lessons, long id) {
        return null;
    }

    @Override
    public Lessons delete(long id) {
        lessionsRepo.deleteById(id);
        return null;
    }

    @Override
    public Lessons findById(long id) {
        return lessionsRepo.findById(id).get();
    }

    @Override
    public List<Lessons> findAll() {
        return lessionsRepo.findAll();
    }

    @Override
    public List<Lessons> findByCourseName(CourseModel courseName) {
        return lessionsRepo.findByCourseModel(courseName);
    }

    @Override
    public Lessons findByName(String name) {
        return lessionsRepo.findByLessonsname(name);
    }
}
