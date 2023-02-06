package com.shruteekaTech.Service;

import java.util.List;

import com.shruteekaTech.Dao.ContactDaoI;
import com.shruteekaTech.model.Contact;

public class ContactServiceImpl implements ContactService {

	private ContactDaoI contactDaoI;
	
    public void setContactDaoI(ContactDaoI contactDaoI) {
		this.contactDaoI = contactDaoI;
	}

	public String getNameById(Integer id) {
	
		String name = contactDaoI.findNameById(id);
		   String fromattedname = name.toUpperCase();
		    
		return fromattedname;
	}

	@Override
	public String getContactById(Integer id) {
		String contact = contactDaoI.findContactById(id);
		if(!contact.isEmpty()) 
		{
		return contact;
		}
		return null;
	}

	@Override
	public List<Contact> getallContact() {
		List<Contact> contactList = contactDaoI.findallContact();
		if(!contactList.isEmpty()) 
		{
		return contactList;
		}
		return null;
	}
}
