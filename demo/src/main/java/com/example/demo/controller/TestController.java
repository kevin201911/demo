package com.example.demo.controller;


import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@RestController
public class TestController {

    @RequestMapping("/say")
    public String path() throws IOException {

        return "ok";
    }
}
