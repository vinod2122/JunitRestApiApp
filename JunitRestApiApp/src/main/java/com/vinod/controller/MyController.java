package com.vinod.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
	
	@GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @PostMapping("/create")
    public String create(@RequestBody String data) {
        // Logic to create a resource
        return "Resource created with data: " + data;
    }

    @PutMapping("/update")
    public String update(@RequestBody String data) {
        // Logic to update a resource
        return "Resource updated with data: " + data;
    }

    @DeleteMapping("/delete")
    public String delete() {
        // Logic to delete a resource
        return "Resource deleted";
    }

}
