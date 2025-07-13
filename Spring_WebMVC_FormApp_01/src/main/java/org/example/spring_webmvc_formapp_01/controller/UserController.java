package org.example.spring_webmvc_formapp_01.controller;

import org.example.spring_webmvc_formapp_01.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String loadFrom(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/user")
    public String handleSubmitInfo(User user, Model model) {
        System.out.println(user);
        model.addAttribute("msg", user);
        return "index";
    }
}
