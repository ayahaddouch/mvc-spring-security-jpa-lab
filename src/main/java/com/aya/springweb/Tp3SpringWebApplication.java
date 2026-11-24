package com.aya.springweb;

import com.aya.springweb.entities.Product;
import com.aya.springweb.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@SpringBootApplication
public class Tp3SpringWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp3SpringWebApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ProductService productService) {
        return args -> {
            productService.addProduct(new Product(null, "ordinateur", 5000, 12, true ));
            productService.addProduct(new Product(null, "telephone", 2500, 5, true ));
            productService.addProduct(new Product(null, "tablette", 3000, 10, false ));
            productService.addProduct(new Product(null, "souris", 250, 50, true ));
            productService.addProduct(new Product(null, "clavier", 500, 36, false ));
            productService.addProduct(new Product(null, "chargeur", 600, 25, true ));
        };
    }

}
