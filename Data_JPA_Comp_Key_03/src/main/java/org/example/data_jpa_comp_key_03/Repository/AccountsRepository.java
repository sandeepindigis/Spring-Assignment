package org.example.data_jpa_comp_key_03.Repository;

import org.example.data_jpa_comp_key_03.entity.Accounts;
import org.example.data_jpa_comp_key_03.entity.AccountsPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts, AccountsPK> {
}
