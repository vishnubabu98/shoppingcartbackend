package com.nest.shoppingcartnew_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCart {
    @GetMapping("/")
    public String viewProduct(){
        return "welcome to view products page";
    }
    @PostMapping("/add")
    public  String addProduct(){
        return"welcome product add page";
    }
}
