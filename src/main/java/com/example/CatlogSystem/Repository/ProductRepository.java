package com.example.CatlogSystem.Repository;


import com.example.CatlogSystem.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
// Mongo repository interface
public interface ProductRepository extends MongoRepository<Product, String> {}
