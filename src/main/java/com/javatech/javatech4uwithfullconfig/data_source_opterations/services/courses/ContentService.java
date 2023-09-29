package com.javatech.javatech4uwithfullconfig.data_source_opterations.services.courses;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.Content;

public interface ContentService {
    Content save(Content content);
    Content updateALL(Content content,long id);
    Content updateContent(Content content,long id);
    Content updateContentSEO(Content content,long id);
    Content updateContentLessions(Content content,long id);
    Content delete(long id);

    Content findByLessionId(long id);
    Content findByLessionName(String name);

    Content findByContentId(long id);

}
