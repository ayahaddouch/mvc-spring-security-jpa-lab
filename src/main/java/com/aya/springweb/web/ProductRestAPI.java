package com.aya.springweb.web;

import com.aya.springweb.entities.Product;
import com.aya.springweb.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductRestAPI {
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.findAll();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable(name = "id")Long id){
        return productService.findById(id);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProductById(@PathVariable(name = "id") Long id){
        productService.deleteById(id);
    }

}
