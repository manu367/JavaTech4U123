package com.javatech.javatech4uwithfullconfig.data_source_opterations.repo.courserepo;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<CategoryModel, Long> {

}
