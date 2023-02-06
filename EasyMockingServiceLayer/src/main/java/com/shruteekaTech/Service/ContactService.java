package com.shruteekaTech.Service;

import java.util.List;

import com.shruteekaTech.model.Contact;

public interface ContactService {

	public String getNameById(Integer id);
	
	public String getContactById(Integer id);
	
	public List<Contact> getallContact();
}
