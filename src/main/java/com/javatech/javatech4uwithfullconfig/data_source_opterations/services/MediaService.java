package com.javatech.javatech4uwithfullconfig.data_source_opterations.services;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.media.MediaModel;

import java.util.List;

public interface MediaService {
    MediaModel addImage(MediaModel mediaModel);
    void DeleteImage(long id);

    List<MediaModel> getAllImages();
}
