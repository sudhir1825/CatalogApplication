package com.example.CatlogSystem.CatalogService;



import com.example.CatlogSystem.Model.Product;
import com.example.CatlogSystem.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// Handles business logic
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}

