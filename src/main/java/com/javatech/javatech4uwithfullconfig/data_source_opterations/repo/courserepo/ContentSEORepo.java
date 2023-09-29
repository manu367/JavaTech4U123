package com.javatech.javatech4uwithfullconfig.data_source_opterations.repo.courserepo;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.ContentSEO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentSEORepo extends JpaRepository<ContentSEO, Long> {
}
