package org.example.data_jpa_procedure_04.repository;

import org.example.data_jpa_procedure_04.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Products, Integer> {

    // calling procedure from data jpa
    @Query(value = "call getProducts()", nativeQuery = true)
    public List<Products> getAllProduct();
}
