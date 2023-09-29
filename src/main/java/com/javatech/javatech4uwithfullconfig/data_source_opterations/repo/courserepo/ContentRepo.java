package com.javatech.javatech4uwithfullconfig.data_source_opterations.repo.courserepo;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepo extends JpaRepository<Content, Long> {
    @Query("select c from Content c where c.lessons.id=:id")
    Content findByLessons(@Param("id") long id);

    @Query("select c from Content c where c.lessons.lessonsname=:lessionName")
    Content findByLessionName(@Param("lessionName") String lessionName);
}
