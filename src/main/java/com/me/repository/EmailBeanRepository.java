package com.me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.me.modal.EmailBean;
import com.me.modal.Otp;

public interface EmailBeanRepository  extends JpaRepository<EmailBean, Long>{

	@Query(value = "select max(id) from me_email_template", nativeQuery = true)
	Long getMessageId();
	
	EmailBean	findAllByEmailTemplateId(String templateId);
	
}
