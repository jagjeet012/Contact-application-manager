package org.jagjeet.cam.service;

import java.util.Optional;

import org.jagjeet.cam.dao.ContactDaoImpl;
import org.jagjeet.cam.dao.UserDaoImpl;
import org.jagjeet.cam.model.Contact;
import org.jagjeet.cam.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDaoImpl contactDaoImpl;

	@Autowired
	private UserDaoImpl userDaoImpl;

	/* (non-Javadoc)
	 * @see org.jagjeet.cam.service.ContactService#addContact(org.jagjeet.cam.model.Contact)
	 */
	@Override
	public Contact addContact(Contact contact) {
		return contactDaoImpl.addContact(contact);
	}

	/* (non-Javadoc)
	 * @see org.jagjeet.cam.service.ContactService#editContact(org.jagjeet.cam.model.Contact)
	 */
	@Override
	public Contact editContact(Contact contact) {
		return contactDaoImpl.editContact(contact);
	}

	/* (non-Javadoc)
	 * @see org.jagjeet.cam.service.ContactService#deleteContact(int)
	 */
	@Override
	public void deleteContact(int contactId) {
		contactDaoImpl.deleteContact(contactId);
	}

	/* (non-Javadoc)
	 * @see org.jagjeet.cam.service.ContactService#getContactById(int)
	 */
	@Override
	public Optional<Contact> getContactById(int contactId) {
		return contactDaoImpl.getContactById(contactId);
	}

	/* (non-Javadoc)
	 * @see org.jagjeet.cam.service.ContactService#getAllContacts()
	 */
	@Override
	public Iterable<Contact> getAllContacts() {
		return contactDaoImpl.getAllContacts();
	}

	/* (non-Javadoc)
	 * @see org.jagjeet.cam.service.ContactService#getContactsByUserName(java.lang.String)
	 */
	@Override
	public Iterable<Contact> getContactByUserName(String userName) {
		User user = userDaoImpl.getUserByName(userName);
		return contactDaoImpl.getContactByUserId(user.getUserId());
	}

}
