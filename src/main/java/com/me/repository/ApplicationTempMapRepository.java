package com.me.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.modal.ApplicationRegistration;
import com.me.modal.ApplicationTempMapping;

public interface ApplicationTempMapRepository extends JpaRepository<ApplicationTempMapping, Long>{
	List<ApplicationTempMapping> findAllByApplicationId(Long id);
}
