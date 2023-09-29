package com.javatech.javatech4uwithfullconfig.data_source_opterations.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class ProjectsModel {
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

    String title;
    String projectname,authoruname,categoryname;
    @Column(length = 1000000)
    String Description;
    @Column(length = 1000000)
    String projectcode;

    boolean htmlcode;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "project")
    List<ProjectsBinaryData> images;

    public ProjectsModel() {
    }

    public ProjectsModel(String title, String projectname, String authoruname, String categoryname, String description, String projectcode, boolean htmlcode, List<ProjectsBinaryData> images) {
        this.title = title;
        this.projectname = projectname;
        this.authoruname = authoruname;
        this.categoryname = categoryname;
        Description = description;
        this.projectcode = projectcode;
        this.htmlcode = htmlcode;
        this.images = images;
    }

    public ProjectsModel(String title, String projectname, String authoruname, String categoryname, String description, String projectcode) {
        this.title = title;
        this.projectname = projectname;
        this.authoruname = authoruname;
        this.categoryname = categoryname;
        Description = description;
        this.projectcode = projectcode;
    }

    public ProjectsModel(String title, String projectname, String authoruname, String categoryname, String description) {
        this.title = title;
        this.projectname = projectname;
        this.authoruname = authoruname;
        this.categoryname = categoryname;
        Description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getAuthoruname() {
        return authoruname;
    }

    public void setAuthoruname(String authoruname) {
        this.authoruname = authoruname;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getProjectcode() {
        return projectcode;
    }

    public void setProjectcode(String projectcode) {
        this.projectcode = projectcode;
    }

    public boolean isHtmlcode() {
        return htmlcode;
    }

    public void setHtmlcode(boolean htmlcode) {
        this.htmlcode = htmlcode;
    }

    public List<ProjectsBinaryData> getImages() {
        return images;
    }

    public void setImages(List<ProjectsBinaryData> images) {
        this.images = images;
    }
}
