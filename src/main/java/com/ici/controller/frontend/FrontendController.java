package com.ici.controller.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class FrontendController {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "frontend/index";
    }
    @RequestMapping(value = "index1",method = RequestMethod.GET)
    public String index1(){
        return "frontend/index1";
    }
}
