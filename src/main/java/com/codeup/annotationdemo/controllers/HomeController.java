package com.codeup.annotationdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String showGreetings() {
        return "<br><h1 style=\"text-align: center;\">This is the landing page<h1>";
    }
}
