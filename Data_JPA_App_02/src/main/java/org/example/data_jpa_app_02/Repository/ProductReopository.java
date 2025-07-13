package org.example.data_jpa_app_02.Repository;

import org.example.data_jpa_app_02.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReopository extends JpaRepository<Product, Integer> {

}
