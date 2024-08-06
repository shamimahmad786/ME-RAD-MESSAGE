package com.me.bean;

import java.util.List;

public class OtpBeans {

	private String otpId;
	private String mobile;
	private List<String> dynamicData;
	private Long applicationId;

	
	public List<String> getDynamicData() {
		return dynamicData;
	}
	public void setDynamicData(List<String> dynamicData) {
		this.dynamicData = dynamicData;
	}
	public String getOtpId() {
		return otpId;
	}
	public void setOtpId(String otpId) {
		this.otpId = otpId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Long getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
	

	
	
	
	

}
