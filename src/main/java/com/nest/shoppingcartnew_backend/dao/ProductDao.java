package com.nest.shoppingcartnew_backend.dao;

import com.nest.shoppingcartnew_backend.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Products,Integer> {
}
