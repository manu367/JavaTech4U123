package com.javatech.javatech4uwithfullconfig.data_source_opterations.services.courses;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.ContentSEO;

public interface ContentSEOService {
    ContentSEO save(ContentSEO contentSEO);
    ContentSEO update(ContentSEO contentSEO,long id);
    ContentSEO delete(long id);
    ContentSEO findById(long id);

}
