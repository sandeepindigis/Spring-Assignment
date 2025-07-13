package org.example.datajpa_oneotoone_06.repository;

import org.example.datajpa_oneotoone_06.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRespository extends JpaRepository<Person, Integer> {
}
