package com.javatech.javatech4uwithfullconfig;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.servicesImpl.MediaServiceImpl;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.servicesImpl.ProjectServiceImpl;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.servicesImpl.courses.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AllObjects {
    @Autowired
   public ProjectServiceImpl projectService;  // for project operations
    @Autowired
    public MediaServiceImpl mediaService;  // for media operations

    //course operations
    @Autowired
     public CategoryServiceImpl categoryService;
    @Autowired
    public CourseModelServiceImpl courseModelService;
    @Autowired
    public LessionsServiceImpl lessionsService;
    @Autowired
    public ContentServiceImpl contentService;
    @Autowired
    public ContentSEOServiceImpl contentSEOService;
}
