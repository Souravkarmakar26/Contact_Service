package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	// fake contact List
	List<Contact> contactList = List.of(
			new Contact(1, "abc@gmail.com", "Tanya", 123),
			new Contact(2, "xyz@gmail.com", "Abhay", 456),
			new Contact(3, "klj@gmail.com", "Akash", 123),
			new Contact(4, "dfs@gmail.com", "Durgesh", 456)
			);
	
	@Override
	public List<Contact> getContactsOfUser(long userId) {
		// TODO Auto-generated method stub
		return contactList.stream().filter(contact -> contact.getUserId()==(userId)).collect(Collectors.toList());
	}

}
