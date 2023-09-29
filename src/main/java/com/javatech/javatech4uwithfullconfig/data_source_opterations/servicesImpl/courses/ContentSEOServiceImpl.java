package com.javatech.javatech4uwithfullconfig.data_source_opterations.servicesImpl.courses;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.ContentSEO;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.repo.courserepo.ContentSEORepo;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.services.courses.ContentSEOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContentSEOServiceImpl implements ContentSEOService {
    @Autowired
    ContentSEORepo contentSEORepo;

    @Override
    public ContentSEO save(ContentSEO contentSEO) {
        return contentSEORepo.save(contentSEO);
    }

    @Override
    public ContentSEO update(ContentSEO contentSEO, long id) {
        Optional<ContentSEO> optionalContentSEO =contentSEORepo.findById(id);
        if (optionalContentSEO.isPresent()){
            ContentSEO model=optionalContentSEO.get();
            model.setDetailsSEO(contentSEO.getDetailsSEO());
            return contentSEORepo.save(model);
        }
        return null;
    }

    @Override
    public ContentSEO delete(long id) {
        contentSEORepo.deleteById(id);
        return null;
    }

    @Override
    public ContentSEO findById(long id) {
        return contentSEORepo.findById(id).get();
    }
}
