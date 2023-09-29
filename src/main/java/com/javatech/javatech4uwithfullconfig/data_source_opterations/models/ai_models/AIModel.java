package com.javatech.javatech4uwithfullconfig.data_source_opterations.models.ai_models;


import jakarta.persistence.*;

@Entity
public class AIModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name,link,category,image;
    @Column(length = 1000)
    String description;

    @OneToOne
    AI_Images ai_images;

    public AIModel() {
    }

    public AIModel(String name, String link, String category, String image, String description, AI_Images ai_images) {
        this.name = name;
        this.link = link;
        this.category = category;
        this.image = image;
        this.description = description;
        this.ai_images = ai_images;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AI_Images getAi_images() {
        return ai_images;
    }

    public void setAi_images(AI_Images ai_images) {
        this.ai_images = ai_images;
    }
}
