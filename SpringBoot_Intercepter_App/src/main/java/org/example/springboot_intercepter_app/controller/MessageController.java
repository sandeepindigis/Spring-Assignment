package org.example.springboot_intercepter_app.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MessageController {

    @GetMapping("/welcome")
    public String welcomeMSg(@RequestParam String clientId){
        return "Welcome to Spring Boot!";
    }

    @GetMapping("/greet")
    public String greetingMSg(@RequestParam String clientId){
        return "Greetings from Spring Boot!";
    }
}
