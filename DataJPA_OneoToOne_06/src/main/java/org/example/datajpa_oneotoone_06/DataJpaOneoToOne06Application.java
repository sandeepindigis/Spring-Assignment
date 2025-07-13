package org.example.datajpa_oneotoone_06;

import org.example.datajpa_oneotoone_06.entity.Passport;
import org.example.datajpa_oneotoone_06.entity.Person;
import org.example.datajpa_oneotoone_06.repository.PassportRepository;
import org.example.datajpa_oneotoone_06.repository.PersonRespository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class DataJpaOneoToOne06Application {

    public static void main(String[] args) {


        ConfigurableApplicationContext context=SpringApplication.run(DataJpaOneoToOne06Application.class, args);

        PersonRespository personRespository=context.getBean(PersonRespository.class);

        PassportRepository passportRepository=context.getBean(PassportRepository.class);

        Person p=new Person();
        p.setPerson_name("Sandeep");
        p.setPerson_gender("Male");

        Passport passport=new Passport();
        passport.setPass_number("asd23123123");
        passport.setIssue_date(LocalDate.now());
        passport.setExpiry_date(LocalDate.now().plusYears(10));

        p.setPerson_passport(passport);
        passport.setPerson(p);

//        personRespository.save(p);

//        personRespository.findById(1);
        personRespository.deleteById(1);

    }

}
