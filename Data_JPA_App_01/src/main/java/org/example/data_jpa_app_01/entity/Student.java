package org.example.data_jpa_app_01.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="STUDENT_DTLS")
public class Student {
    public Student() {}

    public Student(int studentId, String gender, String name, Long rank) {
        super();
        this.studentId=studentId;
        this.gender=gender;
        this.name=name;
        this.rank=rank;
    }

    @Id
    @Column(name = "student_id")
    private int studentId;

    @Column(name = "student_name")
    private String name;

    @Column(name = "student_rank")
    private Long rank;

    @Column(name = "student_gender")
    private String gender;

    @CreationTimestamp
    @Column(name = "CREATE_DATE", updatable = false)
    private LocalDate creatDate;

    @UpdateTimestamp
    @Column(name = "UPDATE_DATE", insertable = false    )
    private LocalDate updatDate;


    public LocalDate getUpdatDate() {
        return updatDate;
    }

    public void setUpdatDate(LocalDate updatDate) {
        this.updatDate = updatDate;
    }

    public LocalDate getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(LocalDate creatDate) {
        this.creatDate = creatDate;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
    return "Student [studentId=" + studentId + ", name=" + name + ", rank=" + rank + ", gender=" + gender + "]";
    }
}
