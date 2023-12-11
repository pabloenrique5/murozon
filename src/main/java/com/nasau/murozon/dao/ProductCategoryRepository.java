package com.nasau.murozon.dao;

import com.nasau.murozon.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category") // productCategory - name of JSON entry
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
