package com.javatech.javatech4uwithfullconfig.data_source_opterations.models.media;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class MediaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String imageurl;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    public MediaModel() {
    }

    public MediaModel(String imageurl, Date timestamp) {
        this.imageurl = imageurl;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
