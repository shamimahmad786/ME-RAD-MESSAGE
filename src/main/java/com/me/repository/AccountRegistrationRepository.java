package com.me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.me.modal.AccountRegistration;
import com.me.modal.EmailBean;

public interface AccountRegistrationRepository  extends JpaRepository<AccountRegistration, Long>{
	
	@Query(value = "select * from me_account_registration a where a.id=?", nativeQuery = true)
	AccountRegistration findAccountDataById(Long id);
}
