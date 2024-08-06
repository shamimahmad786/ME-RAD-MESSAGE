package com.me.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "me_email_template")
public class EmailBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "application_name")
    private String applicationName;
	@Column(name = "application_id")
	private String applicationId;
	@Column(name = "template_name")
	private String templateName;
	
	@Column(name = "email_template_id")
    private String emailTemplateId;
	@Column(name = "email_to_type")
	private String emailToType;
	@Column(name = "email_to")
    private String emailTo;
	@Column(name = "email_cc_type")
	private String emailCcType;
	@Column(name = "email_cc")
    private String emailCc;
	@Column(name = "subject_type")
	private String subjectType;
	@Column(name = "subject")
    private String subject;
	@Column(name = "signature_type")
	private String signatureType;
	@Column(name = "signature")
    private String signature;
	@Column(name = "content_type")
	private String contentType;
	@Column(name = "content")
    private String content;
	@Column(name = "closingType")
	private String closingType;
	@Column(name = "closing")
	private String closing;
	@Column(name = "attachment_yn")
	private Integer attachmentYn;
	@Column(name = "attachment_path")
	private String attachmentPath;
	
	@Transient
	private String pdfbase64Encoded;
	
	@Transient
	private byte[]  attachmentBytes;
	
	@Transient
	private String attachmentName;
	
	@Transient
	private String mobile;
	
	@Transient
	 private String name;
	
	@Transient
	private String userid;
	
	@Transient
	private Integer teacherId;
	
	@Transient
	private Integer reportType;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	
	public String getEmailTo() {
		return emailTo;
	}
	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}
	public String getEmailCc() {
		return emailCc;
	}
	public void setEmailCc(String emailCc) {
		this.emailCc = emailCc;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getEmailTemplateId() {
		return emailTemplateId;
	}
	public void setEmailTemplateId(String emailTemplateId) {
		this.emailTemplateId = emailTemplateId;
	}
	public String getEmailToType() {
		return emailToType;
	}
	public void setEmailToType(String emailToType) {
		this.emailToType = emailToType;
	}
	public String getEmailCcType() {
		return emailCcType;
	}
	public void setEmailCcType(String emailCcType) {
		this.emailCcType = emailCcType;
	}
	public String getSubjectType() {
		return subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}
	public String getSignatureType() {
		return signatureType;
	}
	public void setSignatureType(String signatureType) {
		this.signatureType = signatureType;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getClosingType() {
		return closingType;
	}
	public void setClosingType(String closingType) {
		this.closingType = closingType;
	}
	public String getClosing() {
		return closing;
	}
	public void setClosing(String closing) {
		this.closing = closing;
	}
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public Integer getAttachmentYn() {
		return attachmentYn;
	}
	public void setAttachmentYn(Integer attachmentYn) {
		this.attachmentYn = attachmentYn;
	}
	public String getAttachmentPath() {
		return attachmentPath;
	}
	public void setAttachmentPath(String attachmentPath) {
		this.attachmentPath = attachmentPath;
	}
	public byte[] getAttachmentBytes() {
		return attachmentBytes;
	}
	public void setAttachmentBytes(byte[] attachmentBytes) {
		this.attachmentBytes = attachmentBytes;
	}
	public String getAttachmentName() {
		return attachmentName;
	}
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}
	public String getPdfbase64Encoded() {
		return pdfbase64Encoded;
	}
	public void setPdfbase64Encoded(String pdfbase64Encoded) {
		this.pdfbase64Encoded = pdfbase64Encoded;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public Integer getReportType() {
		return reportType;
	}
	public void setReportType(Integer reportType) {
		this.reportType = reportType;
	}
	
	
	
	
	


}
