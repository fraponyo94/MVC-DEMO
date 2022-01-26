package com.moringa.moringa_demo.controller;

import com.moringa.moringa_demo.model.Detail;
import com.moringa.moringa_demo.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DetailController {

    @Autowired
    private DetailService detailService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String welcome() {

        return "welcome";
    }

    @RequestMapping(value = "/details",method = RequestMethod.GET)
    public String getForm(Model model) {
        Detail detail = new Detail();
        model.addAttribute("detail", detail);

               return "form";
    }

    @RequestMapping(value = "/details",method = RequestMethod.POST)
    public String submitForm(@ModelAttribute("detail") Detail detail,Model model) {

        model.addAttribute("fullName",detailService.getName(detail));
        return "hello";
    }
}
