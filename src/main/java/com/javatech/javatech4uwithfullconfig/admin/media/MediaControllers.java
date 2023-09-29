package com.javatech.javatech4uwithfullconfig.admin.media;

import com.javatech.javatech4uwithfullconfig.AllObjects;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.media.MediaModel;
import com.javatech.javatech4uwithfullconfig.util.img_saver.ImageSaver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class MediaControllers {

    @Value("${project.upload-dir}")
    String fullpath;

    @Autowired
    AllObjects allObjects;
    @GetMapping("/admin/media")
    public String adminMedia(Model model) {
        model.addAttribute("images",allObjects.mediaService.getAllImages());
        return "admin/media_libary";
    }

    @GetMapping("/admin/addmedia")
    public String adminMedia() {
        return "admin/media_add";
    }

    @GetMapping("/admin/media/image/delete/{id}")
    public String adminMediaDelete(@PathVariable("id") String id) {
        Long longId=Long.parseLong(id);
        allObjects.mediaService.DeleteImage(longId);
        return "redirect:/admin/media";
    }


    @PostMapping("/admin/media/image/upload")
    public String adminMediaImageUpload(@RequestParam MultipartFile file) {
            String imagepath=ImageSaver.uploadImage(file,fullpath);
            if(imagepath!=null) {
               allObjects.mediaService.addImage(new MediaModel(imagepath,new Date()));
            }
        return "redirect:/admin/media";
    }

    @PostMapping("/admin/media/image/upload/usingftech")
    @ResponseBody
    public String adminMediaImageUploadfetch(@RequestParam MultipartFile file) {
        String imagepath=ImageSaver.uploadImage(file,fullpath);
        if(imagepath!=null) {
           return allObjects.mediaService.addImage(new MediaModel(imagepath,new Date())).getImageurl();
        }
        //System.out.println(file.getOriginalFilename());
        return "redirect:/admin/media";
    }
}
