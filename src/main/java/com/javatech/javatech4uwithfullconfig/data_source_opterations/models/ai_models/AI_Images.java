package com.javatech.javatech4uwithfullconfig.data_source_opterations.models.ai_models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AI_Images {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long  imageid;
    String imagelink;

    public AI_Images() {
    }

    public AI_Images(String imagelink) {
        this.imagelink = imagelink;
    }

    public Long getImageid() {
        return imageid;
    }

    public void setImageid(Long imageid) {
        this.imageid = imageid;
    }

    public String getImagelink() {
        return imagelink;
    }

    public void setImagelink(String imagelink) {
        this.imagelink = imagelink;
    }
}
