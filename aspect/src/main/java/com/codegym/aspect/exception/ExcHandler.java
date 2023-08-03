package com.codegym.aspect.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExcHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    public ModelAndView exceptionArguent(IllegalArgumentException e){
        return new ModelAndView("error","messenger",e.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public ModelAndView exception(Exception e){
        return new ModelAndView("error","messenger","error not find by id");
    }
}
