package com.me.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.modal.EmailBean;
import com.me.modal.OtpMailHistry;

public interface OtpMailHistryRepository extends JpaRepository<OtpMailHistry, Integer>{
boolean existsByUniqueId(String uniqueId);

OtpMailHistry findAllByUniqueId(String uniqueId);
}
