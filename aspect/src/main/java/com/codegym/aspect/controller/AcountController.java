package com.codegym.aspect.controller;

import com.codegym.aspect.entity.Acount;
import com.codegym.aspect.service.AcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("acount")
public class AcountController {
    @Autowired
    private AcountService acountService;

    @GetMapping("")
    public ModelAndView getAll(){
        System.out.println("get all Acount controller");
        List<Acount> acountList = acountService.getAll();
        return new ModelAndView("acount","acountList",acountList);
    }
    @GetMapping("/edit/{id}")
    public ModelAndView editAcount(@PathVariable long id){
        Acount acount = acountService.getById(id);
        return new ModelAndView("edit","acount",acount);
    }
}
