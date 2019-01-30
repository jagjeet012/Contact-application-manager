package org.jagjeet.cam.repository;

import org.jagjeet.cam.model.Contact;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

	/**
	 * @param userId
	 * @return
	 */
	@Query("from Contact where userId= :userId")
	public Iterable<Contact> getContactById(@Param("userId") int userId);

}
