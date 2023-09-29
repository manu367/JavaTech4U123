package com.javatech.javatech4uwithfullconfig.data_source_opterations.repo.courserepo;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.CourseModel;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.Lessons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessionsRepo extends JpaRepository<Lessons, Long> {

    @Query("SELECT l FROM Lessons l WHERE l.lessonsname = :lessonename")
    Lessons findByLessonsname(@Param("lessonename") String lessonsname);

    List<Lessons> findByCourseModel(CourseModel courseModel);
}
