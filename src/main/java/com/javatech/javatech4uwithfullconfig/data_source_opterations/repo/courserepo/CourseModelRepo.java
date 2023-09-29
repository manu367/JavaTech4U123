package com.javatech.javatech4uwithfullconfig.data_source_opterations.repo.courserepo;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseModelRepo extends JpaRepository<CourseModel, Long> {
    @Query("select c from CourseModel c where c.name = :name")
    CourseModel findByName(@Param("name") String name);
}
