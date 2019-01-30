package org.jagjeet.cam.service;

import java.util.Optional;

import org.jagjeet.cam.model.Contact;

public interface ContactService {
	
	public Contact addContact(Contact contact);
	
	public Contact editContact(Contact contact);
	
	public void deleteContact(int contactId);
	
	public Optional<Contact> getContactById(int contactId);
	
	public Iterable<Contact> getAllContacts();
	
	public Iterable<Contact> getContactByUserName(String userName);

}
