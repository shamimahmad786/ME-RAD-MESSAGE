package com.me.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.me.modal.AccountRegistration;
import com.me.modal.ApplicationMailMapping;
import com.me.modal.ApplicationRegistration;
import com.me.modal.ApplicationTempMapping;
import com.me.modal.EmailBean;
import com.me.modal.Otp;
import com.me.modal.OtpMailHistry;
import com.me.repository.AccountRegistrationRepository;
import com.me.repository.ApplicationMailMapRepository;
import com.me.repository.ApplicationRegistrationRepository;
import com.me.repository.ApplicationTempMapRepository;
import com.me.repository.EmailBeanRepository;
import com.me.repository.OtpMailHistryRepository;
import com.me.repository.OtpRepository;

@Service
public class OtpServiceImp {
	
	@Autowired
	OtpRepository otpRepository;
	
	@Autowired
	EmailBeanRepository emailBeanRepository;
	
	@Autowired
	OtpMailHistryRepository otpMailHistryRepository;
	
	@Autowired
	AccountRegistrationRepository accountRegistrationRepository;
	
	@Autowired
	ApplicationRegistrationRepository applicationRegistrationRepository;
	
	@Autowired
	ApplicationTempMapRepository applicationTempMapRepository;
	
	@Autowired
	ApplicationMailMapRepository applicationMailMapRepository;
	
	
	public Otp OtpRegistration(Otp data) {
		return otpRepository.save(data);
		
	}
	
	public List<Otp> getOtpTemplate(){
		return otpRepository.findAll();
	}
	
	public EmailBean saveEmailTemplate(EmailBean data) {
		return emailBeanRepository.save(data);
		
	}
	
   public List<EmailBean>	getEmailTemplate(){
	   return emailBeanRepository.findAll();
   }
   
   public Otp getOtpDetailsByOtpId(String otpId) {
	   return otpRepository.findAllByOtpId(otpId);
   }
   
   public Long getOtpId() {
	   
	   if(otpRepository.getOtpId()==null) {
		   return (long) 001;
	   }else {
	   return otpRepository.getOtpId();
	   }
   }
   
   public Long getMessageId() {
	   
	   if(emailBeanRepository.getMessageId()==null) {
		   return (long) 001;
	   }else {
	   return emailBeanRepository.getMessageId();
	   }
	   
   }
   
   
   public void updateHistry(OtpMailHistry uniqueId) {
	  boolean status= otpMailHistryRepository.existsByUniqueId(uniqueId.getUniqueId());
	  
	  OtpMailHistry obj=  otpMailHistryRepository.findAllByUniqueId(uniqueId.getUniqueId());
	  
	  if(obj !=null) {
		  uniqueId.setCount(obj.getCount()+1);
		  uniqueId.setId(obj.getId());
		  otpMailHistryRepository.save(uniqueId);
	  }else {
		  otpMailHistryRepository.save(uniqueId);
	  }
	  
   }
   
   public void deleteOTPTemplete(Long id) {
	   Integer intVal = ((Number)id).intValue();
	   // System.out.println(intVal);
	   otpRepository.deleteOTPId(id);
   }
   
  public List<OtpMailHistry> getDashboardData(){
	  return otpMailHistryRepository.findAll();
  }
 
  public EmailBean getEmailByTemplateId(String templateId){
	  return emailBeanRepository.findAllByEmailTemplateId(templateId);
  }
  
 
//  public ApplicationMailMapping getEmailByTemplateId1(String templateId){
//	  return applicationMailMapRepository.findAllBytemplateId(templateId);
//  }
  
  
  
	public AccountRegistration saveAccountRegistration(AccountRegistration data) {
		return accountRegistrationRepository.save(data);
}


	public ApplicationRegistration saveApplicationRegistration(ApplicationRegistration data) {
		return applicationRegistrationRepository.save(data);
}


	public List<ApplicationTempMapping> saveApplicationTempMapping(List<ApplicationTempMapping> data) {
		return applicationTempMapRepository.saveAll(data);
}
	
	
	 @RequestMapping(method=RequestMethod.POST, value="/getAccountRegistration")
		public List<AccountRegistration> getAccountRegistration() {
		 return accountRegistrationRepository.findAll();
	 }
	 
	 @RequestMapping(method=RequestMethod.POST, value="/getApplicationRegistration")
		public List<ApplicationRegistration> getApplicationRegistration() {
		 return applicationRegistrationRepository.findAll();
	 }
	 
	 @RequestMapping(method=RequestMethod.POST, value="/getApplicationTempMapping")
		public List<ApplicationTempMapping> getApplicationTempMapping() {
			return applicationTempMapRepository.findAll();
	 }
	 
	public ApplicationRegistration getApplicationDetailsById(Long id) {
		// System.out.println("id--->"+id);
		// System.out.println(applicationRegistrationRepository.findAppDataById(id));
		return applicationRegistrationRepository.findAppDataById(id);
//		return applicationRegistrationRepository.findAppDataById(id);
	}
  
	public AccountRegistration	getAccountDetailsById(Long id) {
		return accountRegistrationRepository.findAccountDataById(id);
	}

	
	public List<ApplicationTempMapping> getApplicationTemplated(Long id){
		return applicationTempMapRepository.findAllByApplicationId(id);
	}
	
	public List<ApplicationMailMapping> saveApplicationMailMapping(List<ApplicationMailMapping> data) {
		return applicationMailMapRepository.saveAll(data);
             }
	
	public List<ApplicationMailMapping> getApplicationMailTemplated(String id){
		return applicationMailMapRepository.findAllByApplicationId(id);
	}
	
   
	 
	 public void deleteRegistedApplication(Long data){
		 // System.out.println("data---->"+data);
		 applicationRegistrationRepository.deleteById(data);
	 }
	 
	 
	 public void deleteRegistdedSmsTemplate(Long data){
		 // System.out.println("data---->"+data);
		otpRepository.deleteById(data);
	 }
	 
	 
	 public void deleteRegistdedMailTemplate(Long data){
		 // System.out.println("data---->"+data);
		 emailBeanRepository.deleteById(data);
	 }
	 
	 
	 
	 public void deleteSmsMapping(Long data){
		 // System.out.println("data---->"+data);
		 applicationTempMapRepository.deleteById(data);
	 }
	 
	 
	 public void deleteMailMapping(Long data){
		 // System.out.println("data---->"+data);
		 applicationMailMapRepository.deleteById(data);
	 }

	 
	 public List<OtpMailHistry> getApplicationPerCount() {
		 return otpMailHistryRepository.findAll();
	 }
   
}
