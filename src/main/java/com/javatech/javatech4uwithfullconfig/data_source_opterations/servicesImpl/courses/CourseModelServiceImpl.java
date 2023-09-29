package com.javatech.javatech4uwithfullconfig.data_source_opterations.servicesImpl.courses;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.CourseModel;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.repo.courserepo.CourseModelRepo;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.services.courses.CourseModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseModelServiceImpl implements CourseModelService {
    @Autowired
    CourseModelRepo courseModelRepo;

    @Override
    public CourseModel save(CourseModel courseModel) {
        return courseModelRepo.save(courseModel);
    }

    @Override
    public CourseModel update(CourseModel courseModel, long courseid) {
        CourseModel courseModel1 = courseModelRepo.findById(courseid).get();
        if(courseModel1!=null){
            courseModel1.setName(courseModel.getName());
            courseModel1.setDescription(courseModel.getDescription());
            courseModel1.setImagelink(courseModel.getImagelink());
            courseModel1.setLink(courseModel.getLink());
            courseModel1.setUpdating_date(courseModel.getUpdating_date());
            courseModel1.setCategoryModel(courseModel.getCategoryModel());
            return courseModelRepo.save(courseModel1);
        }
        return null;
    }

    @Override
    public CourseModel delete(long id) {
        courseModelRepo.deleteById(id);
        return null;
    }

    @Override
    public CourseModel findById(long id) {
        return courseModelRepo.findById(id).get();
    }

    @Override
    public List<CourseModel> findAll() {
        return courseModelRepo.findAll();
    }

    @Override
    public CourseModel findByCourseName(String courseName) {
        return courseModelRepo.findByName(courseName);
    }
}
