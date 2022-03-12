package com.sup.ss.empdir.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.lang.Nullable;

@RestController
public class WelcomePageController {

    @GetMapping(value = { "/home", "/home/{username}" }, produces = MediaType.APPLICATION_JSON_VALUE)
    public String welcomepage(@PathVariable("username") @Nullable String username) {
        if (null == username)
            return "Welcome to spring-boot project !!";
        else
            return "Welcome to spring-boot project " + username.toUpperCase();
    }

}