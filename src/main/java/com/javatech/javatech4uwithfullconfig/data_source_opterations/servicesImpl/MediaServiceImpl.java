package com.javatech.javatech4uwithfullconfig.data_source_opterations.servicesImpl;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.media.MediaModel;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.repo.MediaRepo;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.services.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaServiceImpl implements MediaService {
    @Autowired
    MediaRepo mediaRepo;

    @Override
    public MediaModel addImage(MediaModel mediaModel) {
        return mediaRepo.save(mediaModel);
    }

    @Override
    public void DeleteImage(long id) {
        mediaRepo.deleteById(id);
    }

    @Override
    public List<MediaModel> getAllImages() {
        return mediaRepo.findLatestMedia();
    }
}
