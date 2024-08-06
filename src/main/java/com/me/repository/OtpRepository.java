package com.me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.me.modal.Otp;



public interface OtpRepository  extends JpaRepository<Otp, Long>{
Otp findAllByOtpId(String otpId);
@Query(value = "select max(id) from me_otp_template", nativeQuery = true)
Long getOtpId();

@Modifying
@Transactional
 @Query(value = "delete from me_otp_template where id=?", nativeQuery = true)
 void deleteOTPId(Long id);
}
