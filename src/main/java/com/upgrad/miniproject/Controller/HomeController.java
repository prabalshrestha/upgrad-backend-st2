package com.upgrad.miniproject.Controller;

import com.upgrad.miniproject.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {



    @RequestMapping("/")
    private String getAllPost(Model model){



        return "index";
    }



}
