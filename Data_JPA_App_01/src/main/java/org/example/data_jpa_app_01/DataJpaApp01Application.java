package org.example.data_jpa_app_01;

import org.example.data_jpa_app_01.Repository.StudentRepository;
import org.example.data_jpa_app_01.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@SpringBootApplication
public class DataJpaApp01Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context=SpringApplication.run(DataJpaApp01Application.class, args);
        StudentRepository repository=context.getBean(StudentRepository.class);

        //Enter the data in the database
//        Student student=new Student();
//        student.setStudentId(104);
//        student.setName("Sandeep");
//        student.setRank("12347");
//        student.setGender("Male");
//
//        repository.save(student);


        //fetch single data from database
//        Optional<Student> student=repository.findById(101);
//
//        if(student.isPresent()){
//            System.out.println(student.get());
//        }

        // fetch All data from database
//        Iterable<Student> students=repository.findAll();
//        students.forEach(System.out::println);
//        students.forEach(student -> System.out.println(student));

        //Delete The Record
//        if(repository.existsById(101)){
//            repository.deleteById(101);
//            System.out.println("Deleted ......");
//        }else {
//            System.out.println("Record not found");
//        }

        //Count the Records

//        long count=repository.count();
//        System.out.println("Record Count" +count);


//        Student student=new Student(105,"Male","Pramod",23123l);
//        Student student1=new Student(106,"Female","Kusum",23124l);
//        Student student2=new Student(107,"Female","Swati",23125l);
//        Student student3=new Student(108,"Female","Kavita",23126l);
//
//        List<Student> studentList= Arrays.asList(student,student1,student2,student3);
//        repository.saveAll(studentList);

//        List<Student> maleStudent=repository.findByGender("Male");
//        maleStudent.forEach(System.out::println);

//        List<Student> rankedStudent=repository.findByRankGreaterThanEqual(1000l);
//        rankedStudent.forEach(System.out::println);

//        List<Student> allStudents=repository.getAllStudents();
//        allStudents.forEach(System.out::println);

//        List<Student> allStudents=repository.getStudents();
//        allStudents.forEach(System.out::println);

//        List<Student> allStudents=repository.findAll();
//        allStudents.forEach(System.out::println);


//        JPA :-> find all method for fetching all data

//        Scanner scanner=new Scanner(System.in);
//
//        System.out.println("Enter page number: ");
//        int pageNo= scanner.nextInt();
//        int pageSize=3;
//
//        PageRequest pageRequest=PageRequest.of(pageNo-1, pageSize);
//        Page<Student> findAll=repository.findAll(pageRequest);
//        List<Student> findAllStudents=findAll.getContent();
//        findAllStudents.forEach(System.out::println);


//        QueryByExample
//
//        Student s=new Student();
//        s.setGender("Male");
//
//        Example<Student> example=Example.of(s);
//        List<Student> students=repository.findAll(example);
//
//        students.forEach(System.out::println);

//        repository.deleteStudent(110);
//
//        System.out.println("Record Deelted......");

//        repository.updateStudent(101, "Male");
//        System.out.println("Record updated......");

//        repository.insertStudent(110,"Ram","Male");
//        System.out.println("Record inserted......");


        Student student=new Student(111,"Male","Kanti",23123l);
        repository.save(student);

    }
}