package com.javatech.javatech4uwithfullconfig.data_source_opterations.repo;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.ProjectsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProjectRepo extends JpaRepository<ProjectsModel,Integer> {

    @Query("select p from ProjectsModel p where p.title LIKE %:title%")
    ProjectsModel findbytitle(@Param("title")String title);

    @Query("select p from ProjectsModel p where p.projectname LIKE %:projectname%")
    ProjectsModel findbyprojectname(@Param("projectname") String projectname);

    @Query("select p from ProjectsModel p where p.authoruname LIKE %:authorname%")
    ProjectsModel findbyauthoruname(@Param("authorname") String authoruname);

    @Query("select p from ProjectsModel p where p.categoryname LIKE %:categoryname%")
    ProjectsModel findbycategoryname(@Param("categoryname") String categoryname);

    @Query("select p from ProjectsModel p where p.Description LIKE %:description%")
    ProjectsModel findbydescription(@Param("description") String description);

    @Query("select p from ProjectsModel p where p.uuid=:uuid")
    ProjectsModel findbyuuid(@Param("uuid") String uuid);

}
