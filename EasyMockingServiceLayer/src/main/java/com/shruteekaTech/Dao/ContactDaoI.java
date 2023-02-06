package com.shruteekaTech.Dao;

import java.util.List;

import com.shruteekaTech.model.Contact;

public interface ContactDaoI {
	
	public String findNameById(Integer id);
	
	public String findContactById(Integer id);
	
	public List<Contact> findallContact();
}
