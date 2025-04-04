package com.cultural.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    @GetMapping
    public String getMessage(){
        return "Hello Mysore- Cultural City of Karnataka";
    }
}
