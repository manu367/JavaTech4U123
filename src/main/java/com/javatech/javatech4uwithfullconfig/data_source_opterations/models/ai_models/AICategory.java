package com.javatech.javatech4uwithfullconfig.data_source_opterations.models.ai_models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class AICategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @OneToMany
    List<AIModel> aiModelList;
    String categoryname;

    public AICategory(List<AIModel> aiModelList, String categoryname) {
        this.aiModelList = aiModelList;
        this.categoryname = categoryname;
    }

    public AICategory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<AIModel> getAiModelList() {
        return aiModelList;
    }

    public void setAiModelList(List<AIModel> aiModelList) {
        this.aiModelList = aiModelList;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
}
