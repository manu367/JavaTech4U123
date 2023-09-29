package com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course;

import jakarta.persistence.*;

@Entity
public class Lessons {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String lessonsname;
    private String links;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private CourseModel courseModel;

    @OneToOne
    Content content;

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Lessons() {
    }

    public Lessons(String lessonsname, String links) {
        this.lessonsname = lessonsname;
        this.links = links;
    }

    public Lessons(String lessonsname, String links, CourseModel courseModel) {
        this.lessonsname = lessonsname;
        this.links = links;
        this.courseModel = courseModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLessonsname() {
        return lessonsname;
    }

    public void setLessonsname(String lessonsname) {
        this.lessonsname = lessonsname;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public CourseModel getCourseModel() {
        return courseModel;
    }

    public void setCourseModel(CourseModel courseModel) {
        this.courseModel = courseModel;
    }
}
