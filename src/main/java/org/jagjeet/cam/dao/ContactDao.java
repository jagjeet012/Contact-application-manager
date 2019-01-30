package org.jagjeet.cam.dao;

import java.util.Optional;

import org.jagjeet.cam.model.Contact;

public interface ContactDao {
	
	public Contact addContact(Contact contact);
	
	public Contact editContact(Contact contact);
	
	public void deleteContact(int contactId);
	
	public Optional<Contact> getContactById(int contactId);
	
	public Iterable<Contact> getAllContacts();
	
	public Iterable<Contact> getContactByUserId(int userId);

}
