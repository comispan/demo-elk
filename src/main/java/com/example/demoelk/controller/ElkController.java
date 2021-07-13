package com.example.demoelk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@Slf4j
@RestController
public class ElkController {

    @GetMapping(value = "/elk")
    public String helloWorld() {
        String response = "Welcome to JavaInUse" + new Date();
        log.info(response);

        return response;
    }
}
