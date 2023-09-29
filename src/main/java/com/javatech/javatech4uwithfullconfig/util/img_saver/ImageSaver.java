package com.javatech.javatech4uwithfullconfig.util.img_saver;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImageSaver {
    public static String uploadImage(MultipartFile file,String fullpath){
        boolean exists= false;
        String filename=file.getOriginalFilename();

        for(int i=0;i<filename.length();i++){
            if(filename.charAt(i)=='.'){
                break;
            }else if(filename.charAt(i)==' ' || filename.charAt(i)=='!' || filename.charAt(i)=='@' ||  filename.charAt(i)=='#'){
                filename=filename.substring(0,i)+"_"+filename.substring(i+1);
            } else if (filename.charAt(i) == '-' || filename.charAt(i)=='$' ||  filename.charAt(i)=='%') {
                filename = filename.substring(0, i) + "_" + filename.substring(i + 1);
            }
        }

        String save=fullpath+ File.separator+filename;

        try{
            Files.write(Paths.get(save),file.getBytes());
        }catch (Exception e) {
            e.printStackTrace();
        }
        return Imagespath.urlpath+filename;
    }
}
