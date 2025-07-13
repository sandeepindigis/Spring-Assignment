package org.example.spring_webmvc_formapp_02.controller;

import jakarta.validation.Valid;
import org.example.spring_webmvc_formapp_02.binding.Student;
import org.example.spring_webmvc_formapp_02.entity.StudentEntity;
import org.example.spring_webmvc_formapp_02.repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
   private StudentRepository studentRepository;


    @GetMapping("/")
    public String loadForm(Model model) {

        List<String> courseList = new ArrayList<>();
        courseList.add("Java");
        courseList.add("Python");
        courseList.add("C#");
        courseList.add("AWS");
        courseList.add("JavaScript");
        courseList.add("DevOps");

        List<String> timingsList = new ArrayList<>();
        timingsList.add("Morning");
        timingsList.add("Afternoon");
        timingsList.add("Evening");

        model.addAttribute("courses", courseList);
        model.addAttribute("timings", timingsList);
        model.addAttribute("student", new Student());
        return "index";
    }

    @PostMapping("/save")
    public String handleSubmit(@Valid Student student, BindingResult result, Model model) {
        System.out.println(student);
        model.addAttribute("student", student);

        StudentEntity studentEntity = new StudentEntity();
        BeanUtils.copyProperties(student, studentEntity);
            studentRepository.save(studentEntity);

        List<String> courseList = new ArrayList<>();
        courseList.add("Java");
        courseList.add("Python");
        courseList.add("C#");
        courseList.add("AWS");
        courseList.add("JavaScript");
        courseList.add("DevOps");

        List<String> timingsList = new ArrayList<>();
        timingsList.add("Morning");
        timingsList.add("Afternoon");
        timingsList.add("Evening");

        model.addAttribute("courses", courseList);
        model.addAttribute("timings", timingsList);
        model.addAttribute("student", new Student());

        if(result.hasErrors()) {
            return "index";
        }
        return "index";
    }

    @GetMapping("/fetchStudents")
    public String fetchStudent(Model model) {

        List<StudentEntity> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "showDetails";
    }
}
