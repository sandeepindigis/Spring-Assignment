package org.example.spring_webmvc_formapp_02.repository;
import org.example.spring_webmvc_formapp_02.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
}
