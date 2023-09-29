package com.javatech.javatech4uwithfullconfig.data_source_opterations.services;


import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.ProjectsModel;

import java.util.UUID;

public interface ProjectService {

    ProjectsModel addProject(ProjectsModel project);
    ProjectsModel updateProject(ProjectsModel project,int id);
    ProjectsModel deleteProject(int projectId);
    ProjectsModel getProject(int project);
    ProjectsModel getProjectById(int id);
    ProjectsModel getProjectByTitle(String title);
    ProjectsModel getProjectByProjectName(String projectname);
    ProjectsModel getProjectByAuthorUname(String authoruname);
    ProjectsModel getProjectByCategoryName(String categoryname);
    ProjectsModel getProjectByDescription(String description);
    ProjectsModel getProjectByUUID(UUID uuid);
}
