package com.javatech.javatech4uwithfullconfig.data_source_opterations.servicesImpl;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.ProjectsModel;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.repo.ProjectRepo;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectRepo projectRepo;
    @Override
    public ProjectsModel addProject(ProjectsModel project) {
        return projectRepo.save(project);
    }

    @Override
    public ProjectsModel updateProject(ProjectsModel project, int id) {
        Optional<ProjectsModel> optional=projectRepo.findById(id);
        if(optional.isPresent()){
            ProjectsModel projectsModel=optional.get();
            if(project.getUuid().toString()!=null){
                projectsModel.setUuid(project.getUuid());
            }
            if(project.getImages().size()!=0){
                projectsModel.setImages(project.getImages());
            }
            projectsModel.setAuthoruname(project.getAuthoruname());
            projectsModel.setCategoryname(project.getCategoryname());
            projectsModel.setDescription(project.getDescription());
            projectsModel.setProjectname(project.getProjectname());
            projectsModel.setTitle(project.getTitle());
           return projectRepo.save(projectsModel);
        }
        return null;
    }

    @Override
    public ProjectsModel deleteProject(int projectId) {
        Optional<ProjectsModel> optional=projectRepo.findById(projectId);
        if(optional.isPresent()){
            ProjectsModel projectsModel=optional.get();
            projectRepo.delete(projectsModel);
            return projectsModel;
        }
        return null;
    }

    @Override
    public ProjectsModel getProject(int project) {
        return projectRepo.findById(project).get();
    }

    @Override
    public ProjectsModel getProjectById(int id) {
        return projectRepo.findById(id).get();
    }

    @Override
    public ProjectsModel getProjectByTitle(String title) {
        return projectRepo.findbytitle(title);
    }

    @Override
    public ProjectsModel getProjectByProjectName(String projectname) {
        return projectRepo.findbyprojectname(projectname);
    }

    @Override
    public ProjectsModel getProjectByAuthorUname(String authoruname) {
        return projectRepo.findbyauthoruname(authoruname);
    }

    @Override
    public ProjectsModel getProjectByCategoryName(String categoryname) {
        return projectRepo.findbycategoryname(categoryname);
    }

    @Override
    public ProjectsModel getProjectByDescription(String description) {
        return projectRepo.findbydescription(description);
    }

    @Override
    public ProjectsModel getProjectByUUID(UUID uuid) {
        return projectRepo.findbyuuid(uuid.toString());
    }
}
