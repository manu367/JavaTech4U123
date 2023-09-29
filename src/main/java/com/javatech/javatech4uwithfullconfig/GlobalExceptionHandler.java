package com.javatech.javatech4uwithfullconfig;

import com.javatech.javatech4uwithfullconfig.exception.AdminException;
import com.javatech.javatech4uwithfullconfig.exception.ClientException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AdminException.class)
    public String handleNullPointerException(){
        return "admin/error";
    }

    @ExceptionHandler(ClientException.class)
    public String clientNullPointerException(){
        return "user/error";
    }

    @ExceptionHandler(Exception.class)
    public String handleException(){
        return "user/error";
    }
}
