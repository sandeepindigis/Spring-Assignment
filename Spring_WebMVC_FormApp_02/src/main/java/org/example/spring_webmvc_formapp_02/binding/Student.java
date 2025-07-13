package org.example.spring_webmvc_formapp_02.binding;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


import java.util.Arrays;


public class Student {
    @NotNull
    public Integer studentId;
    @NotNull
    @Size(min = 3, max = 15)
    public String studentName;
    @NotNull
    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
    public String email;
    @NotNull
    public String gender;
    public String course;
    public String[] timing;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String[] getTiming() {
        return timing;
    }

    public void setTiming(String[] timing) {
        this.timing = timing;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", course='" + course + '\'' +
                ", timing=" + Arrays.toString(timing) +
                '}';
    }
}
