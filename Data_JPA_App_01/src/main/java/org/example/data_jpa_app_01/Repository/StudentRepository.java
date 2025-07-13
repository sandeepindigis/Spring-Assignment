package org.example.data_jpa_app_01.Repository;
import jakarta.transaction.Transactional;
import org.example.data_jpa_app_01.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;

import java.util.List;

//We can also use the CrudRepository in place of JpaRepository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    public List<Student> findByGender(String name);
    public List<Student> findByRankGreaterThanEqual(Long rank);


//    Native SQL Query
    @Query(value = "select * from student_dtls", nativeQuery = true)
    public List<Student> getAllStudents();

//    HQL(HIbernate query) Query Language

    @Query("from Student")
    public List<Student> getStudents();

    @Query("delete from Student where studentId= :sid")
    @Modifying
    @Transactional
    public void deleteStudent(Integer sid);

    @Query("update Student set gender= :gender where studentId= :sid")
    @Modifying
    @Transactional
    public void updateStudent(Integer sid, String gender);

    @Query("insert into Student(studentId,name,gender) values(:studentId, :name, :gender)")
    @Modifying
    @Transactional
    public void insertStudent(Integer studentId, String name, String gender);

    @Query("from Student")
    public void fetchStudents();
}
