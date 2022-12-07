package com.nest.shoppingcartnew_backend.dao;

import com.nest.shoppingcartnew_backend.model.Products;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductDao extends CrudRepository<Products,Integer> {
    @Query(value="SELECT `id`, `category`, `description`, `image`, `name`, `price` FROM `products` WHERE `name`LIKE %:name%",nativeQuery = true)
    List<Products>searchProduct(@Param("name") String name);
}
