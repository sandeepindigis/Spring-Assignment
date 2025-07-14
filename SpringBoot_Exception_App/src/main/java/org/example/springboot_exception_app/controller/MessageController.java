package org.example.springboot_exception_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ResponseBody
public class MessageController {

    @GetMapping("/welcome")
    public String welcomeMsg(){
        String msg="Welcome to Spring Boot Exception";

        int i=10/0;

        return msg;
    }

    @GetMapping("/greet")
    public String greetMsg(){

        String msg = "Greeting from Spring Boot Exception";

//        String s=null;
//        s.length();

        return msg;
    }

    @ExceptionHandler(value = AbstractMethodError.class)
    public ModelAndView handleAE(ArithmeticException ex){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("error");
        return mav;
    }
}
