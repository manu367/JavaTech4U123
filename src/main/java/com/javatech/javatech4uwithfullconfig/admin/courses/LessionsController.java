package com.javatech.javatech4uwithfullconfig.admin.courses;

import com.javatech.javatech4uwithfullconfig.AllObjects;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.Content;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.CourseModel;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.course.Lessons;
import com.javatech.javatech4uwithfullconfig.exception.AdminException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LessionsController {

    @Autowired
    AllObjects allObjects;

    @GetMapping("/admin/{coursename}/{courseid}/lessions/")
    public String Lessions(@PathVariable("courseid") String courseid, Model model) {
        try{
            CourseModel courseModel =allObjects.courseModelService.findById(Long.parseLong(courseid));
            if(courseModel!=null){
               List<Lessons> lessonsList =allObjects.lessionsService.findByCourseName(courseModel);
               model.addAttribute("lessonsList",lessonsList);
               model.addAttribute("course",courseModel);
            }else{
                throw new AdminException("Course id is null");
            }
        }catch (Exception e){
            throw new AdminException("Course id is null");
        }

        return "admin/couurse_lessions";
    }

    @PostMapping("/admin/{coursename}/{courseid}/lessions/add")
    @ResponseBody
    public String addLessions(@RequestParam String lessionname,@RequestParam String courseid){
        try{
            Lessons lessons = new Lessons();
            lessons.setLessonsname(lessionname);
            lessons.setLinks("/"+lessionname.replace(" ","-"));
            lessons.setCourseModel(allObjects.courseModelService.findById(Long.parseLong(courseid)));
            Lessons lessons1=allObjects.lessionsService.save(lessons);
            if(lessons1!=null){
                return "save ho gya";
            }
        }catch (Exception e){
            throw new AdminException("some error found");
        }
        return "admin/couurse_lessions";
    }


    //content

    @GetMapping("/admin/{courseid}/lessions/{lessionid}/{lessionName}/content")
    public String LessionsContent(@PathVariable("courseid") String courseid,
                                  @PathVariable("lessionid") String lessionid,
                                  @PathVariable("lessionName") String lessionName,
                                  Model model) {
        Content content =allObjects.contentService.findByLessionName(lessionName);
        model.addAttribute("images",allObjects.mediaService.getAllImages());
        if(content!=null){
            System.out.println("content is not null");
            model.addAttribute("button operations","onupdate()");
        }else{
            System.out.println("content is null");
        }
       // model.addAttribute("content","helo manu  how are you");
        return "admin/course_lessions_writing";
    }

    @GetMapping("/admin/{courseid}/lessions/{lessionid}/{lessionName}/content/add")
    @ResponseBody
    public String LessionsContentAdd(@PathVariable("courseid") String courseid,
                                  @PathVariable("lessionid") String lessionid,
                                  @PathVariable("lessionName") String lessionName,
                                  Model model) {
        return "admin/course_lessions_writing";
    }
}
