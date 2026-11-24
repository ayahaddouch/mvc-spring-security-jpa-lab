package com.aya.springweb.reposetories;

import com.aya.springweb.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
