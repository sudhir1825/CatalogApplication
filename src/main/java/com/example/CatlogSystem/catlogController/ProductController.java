package com.example.CatlogSystem.catlogController;


import com.example.CatlogSystem.CatalogService.ProductService;
import com.example.CatlogSystem.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
// Handles web requests
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String index() {
        return "index";// Load index page
    }

    @GetMapping("/addProduct")
    public String addProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "addProduct";// Show form
    }

    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute Product product) {
        productService.addProduct(product);
        return "redirect:/showProducts";// Redirect to list
    }

    @GetMapping("/showProducts")
    public String showProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "showProducts";
    }
}
