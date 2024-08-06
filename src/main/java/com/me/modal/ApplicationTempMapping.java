package com.me.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "me_application_tempmapping")
public class ApplicationTempMapping {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "application_id")
	private Long applicationId;
	@Column(name = "application_name")
	private String applicationName;
	@Column(name = "template_id")
	private Long templateId;
	@Column(name = "template_name")
	private String templateName;
	@Column(name = "template_uniqe_id")
	private String templateUniqeId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public Long getTemplateId() {
		return templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getTemplateUniqeId() {
		return templateUniqeId;
	}
	public void setTemplateUniqeId(String templateUniqeId) {
		this.templateUniqeId = templateUniqeId;
	}
	
	
	
	
	
}
