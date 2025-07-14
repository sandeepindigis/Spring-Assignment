package org.example.sb_rest_api_01.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/welcome")
    public ResponseEntity<String> getMessage(){
        String msg="Welcome to Ashok It";
        return new ResponseEntity<>(msg,HttpStatus.OK);
    }

    @GetMapping("/greet")
    public String getGreetMsg(){
        return "Greet Message....!!";
    }
}
