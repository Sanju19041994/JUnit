package com.shruteekaTech.model;

public class Contact {

	int id;
	String name;
	String contactNo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	
	public Contact(int id, String name, String contactNo) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", contactNo=" + contactNo + "]";
	}
	
	
}
