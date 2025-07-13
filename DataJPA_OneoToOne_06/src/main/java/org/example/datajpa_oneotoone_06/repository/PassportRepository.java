package org.example.datajpa_oneotoone_06.repository;

import org.example.datajpa_oneotoone_06.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport, Integer> {
}
