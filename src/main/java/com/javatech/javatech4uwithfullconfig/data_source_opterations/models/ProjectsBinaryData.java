package com.javatech.javatech4uwithfullconfig.data_source_opterations.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class ProjectsBinaryData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    UUID uuid;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    String Url;
    @ManyToOne
    @JoinColumn(name = "project_id")
    ProjectsModel project;

    public ProjectsBinaryData(String url, ProjectsModel project) {
        Url = url;
        this.project = project;
    }

    public ProjectsBinaryData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public ProjectsModel getProject() {
        return project;
    }

    public void setProject(ProjectsModel project) {
        this.project = project;
    }
}
