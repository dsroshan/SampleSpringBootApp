package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @RequestMapping(method = RequestMethod.POST, value = "/test")
    public String sample() {
        return "Hello world!";
    }
}