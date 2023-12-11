package com.nasau.murozon.dao;

import com.nasau.murozon.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200") // Aunque también esté levantado el front en localhost, el origen es distinto porque no coinciden los puertos
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
