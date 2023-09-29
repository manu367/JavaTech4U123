package com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class CourseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String imagelink;
    private String link;

    @Column(length = 4000)
    private String description;
    private Date creatingdate;
    private Date updating_date;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryModel categoryModel;

    @OneToMany(mappedBy = "courseModel")
    private List<Lessons> lessons;

    public CourseModel() {
    }

    public CourseModel(String name, String imagelink, String link, String description, Date creatingdate, Date updating_date) {
        this.name = name;
        this.imagelink = imagelink;
        this.link = link;
        this.description = description;
        this.creatingdate = creatingdate;
        this.updating_date = updating_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagelink() {
        return imagelink;
    }

    public void setImagelink(String imagelink) {
        this.imagelink = imagelink;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatingdate() {
        return creatingdate;
    }

    public void setCreatingdate(Date creatingdate) {
        this.creatingdate = creatingdate;
    }

    public Date getUpdating_date() {
        return updating_date;
    }

    public void setUpdating_date(Date updating_date) {
        this.updating_date = updating_date;
    }

    public CategoryModel getCategoryModel() {
        return categoryModel;
    }

    public void setCategoryModel(CategoryModel categoryModel) {
        this.categoryModel = categoryModel;
    }

    public List<Lessons> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lessons> lessons) {
        this.lessons = lessons;
    }
}

