package com.example.helloapi.controller;

import com.example.common.utils.Multiplier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping
    public String getHello(@RequestParam String number){
        int result = Multiplier.multiplyBy10(Integer.parseInt(number));
        return "Hello " + String.valueOf(result) ;
    }
}
