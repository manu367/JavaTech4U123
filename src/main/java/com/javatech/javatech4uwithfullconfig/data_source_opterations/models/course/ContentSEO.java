package com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course;

import jakarta.persistence.*;

@Entity
public class ContentSEO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 4000)
    private String detailsSEO;
    @OneToOne
    @JoinColumn(name = "content_id")
    private Content content;

    public ContentSEO() {
    }

    public ContentSEO(String detailsSEO, Content content) {
        this.detailsSEO = detailsSEO;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetailsSEO() {
        return detailsSEO;
    }

    public void setDetailsSEO(String detailsSEO) {
        this.detailsSEO = detailsSEO;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }
}
