package cn.bdqn.testthymeleaf1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/index")
    public String index(Model model){

        model.addAttribute("msg","this new message!!");
        return "index";
    }
}
