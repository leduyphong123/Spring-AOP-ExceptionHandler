package com.codegym.aspect.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Aspect
@Component
public class AcountAspect {

    @Before(value = "executeController()")
    public void beforExecuteController(){
        System.out.println("befor execute controller");
    }
    @After(value = "executeController()")
    public void afterExecuteController(){
        System.out.println("after execute controller");
    }
    @AfterReturning(value = "executeController()")
    public void afterReturningExecuteController(){
        System.out.println("after returning execute controller");
    }
    @AfterThrowing(value = "executeController()")
    public void afterThrowingExecuteController(){
        System.out.println("after throwing execute controller");
    }
//    @Around(value = "executeController()")
//    public ModelAndView aroundExecuteController(){
//        System.out.println("around execute controller");
//        return new ModelAndView("acount");
//    }
    @Pointcut(value = "within(com.codegym.aspect.controller.*)")
    public void executeController() {}
}
