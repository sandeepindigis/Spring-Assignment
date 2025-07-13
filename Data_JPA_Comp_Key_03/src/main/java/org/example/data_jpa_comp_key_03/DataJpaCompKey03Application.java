package org.example.data_jpa_comp_key_03;

import org.example.data_jpa_comp_key_03.Repository.AccountsRepository;
import org.example.data_jpa_comp_key_03.entity.Accounts;
import org.example.data_jpa_comp_key_03.entity.AccountsPK;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class DataJpaCompKey03Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context=SpringApplication.run(DataJpaCompKey03Application.class, args);

        AccountsRepository accountsRepository=context.getBean(AccountsRepository.class);


        // For insert the data in the database
//        AccountsPK accountsPK=new AccountsPK();
//        accountsPK.setAccount_id(2);
//        accountsPK.setAccount_type("Current");
//        accountsPK.setAccount_number(13131241);
//
//        Accounts accounts=new Accounts();
//        accounts.setHolderName("Sandeep Sharma");
//        accounts.setBranchName("Aligarh");
//        accounts.setAccountsPK(accountsPK);
//
//        accountsRepository.save(accounts);


        //For Fetch the data

        AccountsPK accountsPK=new AccountsPK();
        accountsPK.setAccount_id(2);
        accountsPK.setAccount_type("Current");
        accountsPK.setAccount_number(13131241);

        Optional<Accounts> accounts=accountsRepository.findById(accountsPK);
        if(accounts.isPresent()){
            System.out.println(accounts.get());
        }
    }

}
