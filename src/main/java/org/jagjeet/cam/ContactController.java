package org.jagjeet.cam;

import java.util.Optional;

import org.jagjeet.cam.model.Contact;
import org.jagjeet.cam.service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Developer
 *
 */
@RestController
public class ContactController {

	@Autowired
	private ContactServiceImpl contactServiceImpl;

	/**
	 * @param contact
	 * @return
	 */
	@PostMapping("/contacts")
	public Contact addContact(@RequestBody Contact contact) {
		return contactServiceImpl.addContact(contact);
	}

	/**
	 * @param contactId
	 * @return
	 */
	@GetMapping("/contacts/{contact}")
	public Optional<Contact> getContactByContactId(@PathVariable int contactId) {
		return contactServiceImpl.getContactById(contactId);
	}

	/**
	 * @return
	 */
	@GetMapping("/contacts")
	public Iterable<Contact> getAllContacts() {
		return contactServiceImpl.getAllContacts();
	}

	/**
	 * @param userName
	 * @return
	 */
	@GetMapping("/contactsByName/{userName}")
	public Iterable<Contact> getContactByUserName(@PathVariable String userName) {
		return contactServiceImpl.getContactByUserName(userName);
	}

	/**
	 * @param contactId
	 */
	@DeleteMapping("/contacts/{contactId}")
	public void deleteContact(@PathVariable int contactId) {
		contactServiceImpl.deleteContact(contactId);
	}

	/**
	 * @param contact
	 * @param contactId
	 */
	@PutMapping("/contacts/{contactId}")
	public void updateContact(@RequestBody Contact contact, @PathVariable int contactId) {
		// setting the contact Id
		contact.setContactId(contactId);
		contactServiceImpl.editContact(contact);
	}

}
