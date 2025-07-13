package org.example.data_jpa_onetoone_05.repository;

import org.example.data_jpa_onetoone_05.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddRepository extends JpaRepository<Address, Integer> {
}
