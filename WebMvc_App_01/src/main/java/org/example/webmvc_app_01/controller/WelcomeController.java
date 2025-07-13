package org.example.webmvc_app_01.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public ModelAndView getWelcomeMsg() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg","Welcome to Ashok IT");
        mav.setViewName("index");
        return mav;
    }

    @GetMapping("/greet")
    public ModelAndView getGreetMsg() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg","Good Evening ....!!");
        mav.setViewName("index");
        return mav;
    }

    @GetMapping("/date")
    public ModelAndView getDate() {
        ModelAndView mav = new ModelAndView();
        LocalDate now = LocalDate.now();
        String msgTxt="Today's date is "+now;
        mav.addObject("msg",msgTxt);
        mav.setViewName("index");
        return mav;
    }


//    These are the example of QueryParam/Request Param
    @GetMapping("/msg")
    public ModelAndView getNameDetail(@RequestParam String name) {
        ModelAndView mav = new ModelAndView();
        String msgTxt=name +", Good Morning....!!";
        mav.addObject("msg",msgTxt);
        mav.setViewName("index");
        return mav;
    }

    // Another way to pass the parameter in request param
    @GetMapping("/msg1")
    public ModelAndView getName(@RequestParam ("name") String uname) {
        ModelAndView mav = new ModelAndView();
        String msgTxt=uname +", Good Evening....!!";
        mav.addObject("msg",msgTxt);
        mav.setViewName("index");
        return mav;
    }

//    http://localhost:8080/book?name=Sevent%20thruth%20of%20life&author=Sandeep
    @GetMapping("/book")
    public ModelAndView getBook(@RequestParam ("name") String name, String author) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg",name + " By " + author + "Book is out of stock...");
        mav.setViewName("index");
        return mav;
    }
    //    These are the example of QueryParam/Request Param


    //    These are the example of Path Variables/ PathParameters Param

    @GetMapping("/car/{carId}/hyd")
    public ModelAndView getCarColor(@PathVariable Integer carId) {
        ModelAndView mav = new ModelAndView();

        String color=null;

        if(carId>=100){
            color="red";

        }else {
            color="blue";

        }

        mav.addObject("msg","Car Color is"+color);
        mav.setViewName("index");
        return mav;
    }

//    http://localhost:8080/stock/benz/location/Aligarh
    @GetMapping("/stock/{brand}/location/{loc}")
    public ModelAndView getCarColor(@PathVariable String brand, @PathVariable String loc) {
        ModelAndView mav = new ModelAndView();


        mav.addObject("msg","In" + loc + " "+ brand + "cars out of stock...");
        mav.setViewName("index");
        return mav;
    }


    ///  Another way to create the method in controller

    @GetMapping("/gret")
    public String getGreetMsgs(@RequestParam String name, Model model) {
        model.addAttribute("msg",name + " Good Evening....!!!");
         return "index";
    }


}
