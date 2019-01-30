package org.jagjeet.cam.dao;

import java.util.Optional;

import org.jagjeet.cam.model.User;

public interface UserDao {
	
	public User addUser(User user);
	
	public Optional<User> getUserById(int userId);
	
	public Iterable<User> getAllUser();
	
	public User getUserByName(String userName);

}
