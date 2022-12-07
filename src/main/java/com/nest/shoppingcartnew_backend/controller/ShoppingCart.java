package com.nest.shoppingcartnew_backend.controller;

import com.nest.shoppingcartnew_backend.dao.ProductDao;
import com.nest.shoppingcartnew_backend.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCart {
    @Autowired
    private ProductDao dao;
    @GetMapping("/")
    public String viewProduct(){
        return "welcome to view products page";
    }
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public  String addProduct(@RequestBody Products p){
        System.out.println(p.toString());
        dao.save(p);
        return"product added successfully";
    }
}
