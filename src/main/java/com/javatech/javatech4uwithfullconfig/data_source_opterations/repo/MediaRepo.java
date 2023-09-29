package com.javatech.javatech4uwithfullconfig.data_source_opterations.repo;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.media.MediaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaRepo extends JpaRepository<MediaModel,Long> {
    @Query("SELECT m FROM MediaModel m order by m.timestamp desc")
    List<MediaModel> findLatestMedia();
    //List<MediaModel> findAllByOrderByidDesc();
}
