package com.javatech.javatech4uwithfullconfig.data_source_opterations.servicesImpl.courses;

import com.javatech.javatech4uwithfullconfig.AllObjects;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.Content;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.Lessons;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.repo.courserepo.ContentRepo;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.repo.courserepo.LessionsRepo;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.services.courses.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ContentServiceImpl implements ContentService {
    @Autowired
    ContentRepo contentRepo;
    @Autowired
    LessionsServiceImpl lessionsService;



    @Override
    public Content save(Content content) {
        return contentRepo.save(content);
    }
    @Override
    public Content updateALL(Content content, long id) {
        Content content1=contentRepo.findById(id).orElse(null);
        if(content1!=null){
            content1.setContent(content.getContent());
            content1.setContentSEO(content.getContentSEO());
            content1.setUpdateingdate(new Date());
            content1.setLessons(content.getLessons());
           return contentRepo.save(content1);
        }
        return null;
    }
    @Override
    public Content updateContent(Content content, long id) {
        Content content1=contentRepo.findById(id).orElse(null);
        if(content1!=null){
            content1.setContent(content.getContent());
            content1.setUpdateingdate(new Date());
            return contentRepo.save(content1);
        }
        return null;
    }
    @Override
    public Content updateContentSEO(Content content, long id) {
        Content content1=contentRepo.findById(id).orElse(null);
        if(content1!=null){
            content1.setContentSEO(content.getContentSEO());
            content1.setUpdateingdate(new Date());
            return contentRepo.save(content1);
        }
        return null;
    }
    @Override
    public Content updateContentLessions(Content content, long id) {
        Content content1=contentRepo.findById(id).orElse(null);
        if(content1!=null){
            content1.setUpdateingdate(new Date());
            content1.setLessons(content.getLessons());
            return contentRepo.save(content1);
        }
        return null;
    }
    @Override
    public Content delete(long id) {
        contentRepo.deleteById(id);
        return null;
    }
    @Override
    public Content findByLessionId(long id) {
        Lessons lessons=lessionsService.findById(id);
        if(lessons!=null){
           return contentRepo.findByLessons(lessons.getId());
        }
        return null;
    }
    @Override
    public Content findByLessionName(String name) {
        return contentRepo.findByLessionName(name);
    }
    @Override
    public Content findByContentId(long id) {
        return contentRepo.findById(id).orElse(null);
    }
}
