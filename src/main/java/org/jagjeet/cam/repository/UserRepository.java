package org.jagjeet.cam.repository;

import org.jagjeet.cam.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	/**
	 * @param name
	 * @return
	 * Custom Method to get the user by name
	 */
	@Query("from User where name = :name")
	public User getUserByName(@Param("name") String name);

}
