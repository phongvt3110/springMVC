package com.ici.controller;

import db.model.User;
import db.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
@RequestMapping("/about")
public class HomeController {
    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("name","PhongVT");
        User user = new User();
        user.setUsername("phongvt651043");
        user.setCreatedBy("Evolable asia solution");
        user.setCreatedDate(new Date());
        UserRepository.addUser(user);
        return "home";
    }

    @RequestMapping(value = "welcome",method = RequestMethod.GET)
    public String sayHello(ModelMap model){
        model.addAttribute("greeting","Hello world from Sping Mvc 4");
        return "welcome";
    }
    @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model){
        model.addAttribute("greeting", "Hello World again from Spring MVC 4");
        return "welcome";
    }
    @RequestMapping(value = "/frontend", method = RequestMethod.GET)
    public String frontend(){
        return "frontend/index1";
    }
}
