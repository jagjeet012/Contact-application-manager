package org.jagjeet.cam.dao;

import java.util.Optional;

import org.jagjeet.cam.model.Contact;
import org.jagjeet.cam.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContactDaoImpl implements ContactDao {

	@Autowired
	private ContactRepository contactRepository;

	/* (non-Javadoc)
	 * @see org.jagjeet.cam.dao.ContactDao#addCOntact(org.jagjeet.cam.model.Contact)
	 */
	@Override
	public Contact addContact(Contact contact) {
		return contactRepository.save(contact);
	}

	/* (non-Javadoc)
	 * @see org.jagjeet.cam.dao.ContactDao#editContact(org.jagjeet.cam.model.Contact)
	 */
	@Override
	public Contact editContact(Contact contact) {
		return contactRepository.save(contact);
	}

	/* (non-Javadoc)
	 * @see org.jagjeet.cam.dao.ContactDao#deleteContact(int)
	 */
	@Override
	public void deleteContact(int contactId) {
		contactRepository.deleteById(contactId);
	}

	/* (non-Javadoc)
	 * @see org.jagjeet.cam.dao.ContactDao#getContactById(int)
	 */
	@Override
	public Optional<Contact> getContactById(int contactId) {
		return contactRepository.findById(contactId);
	}

	/* (non-Javadoc)
	 * @see org.jagjeet.cam.dao.ContactDao#getAllContacts()
	 */
	@Override
	public Iterable<Contact> getAllContacts() {
		return contactRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see org.jagjeet.cam.dao.ContactDao#getContactsByUserId(int)
	 */
	@Override
	public Iterable<Contact> getContactByUserId(int userId) {
		return contactRepository.getContactById(userId);
	}

}
