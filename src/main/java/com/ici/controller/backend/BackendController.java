package com.ici.controller.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/backend")
public class BackendController {
    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "backend/index";
    }
    @RequestMapping(value = "index2", method = RequestMethod.GET)
    public String index2() {
        return "backend/index2";
    }
}
