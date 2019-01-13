package com.fluex404.springbootlearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HttpMappingController {

    @GetMapping("/")
    public String createHome() {

        return "index";
    }
}
