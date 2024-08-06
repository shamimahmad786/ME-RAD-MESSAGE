package com.me.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.modal.AccountRegistration;
import com.me.modal.ApplicationMailMapping;
import com.me.modal.ApplicationTempMapping;

public interface ApplicationMailMapRepository extends JpaRepository<ApplicationMailMapping, Long>{

	
	List<ApplicationMailMapping>	findAllByApplicationId(String id);
	
	List<ApplicationMailMapping>  findAllBytemplateId(String templateId);
}
