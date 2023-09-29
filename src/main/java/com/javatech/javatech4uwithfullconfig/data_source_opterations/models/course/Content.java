package com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 100000)
    private String content;

    @OneToOne(mappedBy = "content")
    private ContentSEO contentSEO;

    @OneToOne
    Lessons lessons;

    Date creatingdate;
    Date updateingdate;

    public Content() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ContentSEO getContentSEO() {
        return contentSEO;
    }

    public void setContentSEO(ContentSEO contentSEO) {
        this.contentSEO = contentSEO;
    }

    public Lessons getLessons() {
        return lessons;
    }

    public void setLessons(Lessons lessons) {
        this.lessons = lessons;
    }

    public Date getCreatingdate() {
        return creatingdate;
    }

    public void setCreatingdate(Date creatingdate) {
        this.creatingdate = creatingdate;
    }

    public Date getUpdateingdate() {
        return updateingdate;
    }

    public void setUpdateingdate(Date updateingdate) {
        this.updateingdate = updateingdate;
    }
}
