package com.ici.controller.frontend;

import com.ici.db.model.User;
import com.ici.db.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
@RequestMapping(value = "/")
public class FrontendController {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "frontend/index";
    }
    @RequestMapping(value = "index1",method = RequestMethod.GET)
    public String index1(){
        User user = new User();
        user.setUsername("phongvt651043");
        user.setCreatedBy("EAS-Admin-2018");
        user.setCreatedDate(new Date());
        UserRepository.addUser(user);
        return "frontend/index1";
    }
}
