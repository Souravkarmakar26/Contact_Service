package com.contact.entity;

public class Contact {
	
	private long cId;
	private String emmailId;
	private String contactName;
	
	private long userId;

	public Contact(long cId, String emmailId, String contactName, long userId) {
		super();
		this.cId = cId;
		this.emmailId = emmailId;
		this.contactName = contactName;
		this.userId = userId;
	}

	public Contact() {
		super();
	}

	public long getcId() {
		return cId;
	}

	public String getEmmailId() {
		return emmailId;
	}

	public void setEmmailId(String emmailId) {
		this.emmailId = emmailId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
}
