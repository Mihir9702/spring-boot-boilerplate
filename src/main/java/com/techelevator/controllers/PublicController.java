package com.techelevator.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
@CrossOrigin
@PreAuthorize("isAuthenticated()")
public class PublicController {

    @GetMapping("/hello")
    @PreAuthorize("permitAll")
    public String getHelloMessage() {
        return "Hello World!";
    }
}
