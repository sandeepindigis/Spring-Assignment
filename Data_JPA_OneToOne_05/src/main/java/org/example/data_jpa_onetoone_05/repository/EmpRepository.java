package org.example.data_jpa_onetoone_05.repository;

import org.example.data_jpa_onetoone_05.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Employee, Integer> {
}
