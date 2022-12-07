package com.nest.shoppingcartnew_backend.controller;

import com.nest.shoppingcartnew_backend.dao.ProductDao;
import com.nest.shoppingcartnew_backend.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingCart {
    @Autowired
    private ProductDao dao;
    @CrossOrigin(origins ="*")
    @GetMapping("/view")
    public List<Products> viewProduct(){
        return(List<Products>)dao.findAll();
    }
    @CrossOrigin(origins ="*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public  String addProduct(@RequestBody Products p){
        System.out.println(p.toString());
        dao.save(p);
        return"product added successfully";
    }
    @PostMapping("/search")
    public List searchProduct(@RequestBody Products p){
        String name = p.getName();
        dao.searchProduct(p.getName());
        return(List<Products>)dao.searchProduct(p.getName());
    }
}
