package com.shruteekaTech;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.easymock.EasyMock;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.shruteekaTech.Dao.ContactDaoI;
import com.shruteekaTech.Service.ContactServiceImpl;
import com.shruteekaTech.model.Contact;

public class TestContactService {

	
	
	@Test
	public void testGetNameById() {
		
		//dependent dao : mockDaoCreation
		ContactDaoI proxyDao = EasyMock.createMock(ContactDaoI.class);
		
		// value in proxy Dao
		EasyMock.expect(proxyDao.findNameById(101)).andReturn("Sanju");
		EasyMock.expect(proxyDao.findNameById(102)).andReturn("Santosh");
		
		EasyMock.replay(proxyDao);
		
		// create object of service class where methods available
		ContactServiceImpl contactServiceImpl = new ContactServiceImpl();
		contactServiceImpl.setContactDaoI(proxyDao);
		
		// methods call for test
		String name = contactServiceImpl.getNameById(101);
		System.out.println(name);
		assertNotNull(name);
		
	}
	
	@Test
	public void testGetContactById(){
		
		ContactDaoI proxyDao = EasyMock.createMock(ContactDaoI.class);
		EasyMock.expect(proxyDao.findContactById(101)).andReturn("8989849732");
		EasyMock.replay(proxyDao);
		
		ContactServiceImpl contactServiceImpl = new ContactServiceImpl();
		contactServiceImpl.setContactDaoI(proxyDao);
		
		String contact = contactServiceImpl.getContactById(101);
		System.out.println(contact);
		assertNotNull(contact);
	}
	
	
	@Test
	public void testGetallContact() {
	
		List<Contact> contactList = new ArrayList<Contact>();
		contactList.add(new Contact(101, "sanju", "8989849732"));
		contactList.add(new Contact(102, "santosh", "9789876541"));
	
		ContactDaoI proxyDao = EasyMock.createMock(ContactDaoI.class);
		EasyMock.expect(proxyDao.findallContact()).andReturn(contactList);
		ContactServiceImpl contactServiceImpl = new ContactServiceImpl();
		contactServiceImpl.setContactDaoI(proxyDao);
		
		List<Contact> allcontact = contactServiceImpl.getallContact();
		System.out.println(allcontact);
		assertNotNull(allcontact);
		
	}
	
	
}
