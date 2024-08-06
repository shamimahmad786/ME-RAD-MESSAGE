package com.me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.me.modal.AccountRegistration;
import com.me.modal.ApplicationRegistration;

public interface ApplicationRegistrationRepository extends JpaRepository<ApplicationRegistration, Long>{

//	@Modifying
//	@Transactional
	 @Query(value = "select * from me_application_registration a where a.id=?", nativeQuery = true)
	ApplicationRegistration	findAppDataById(Long id);
}
