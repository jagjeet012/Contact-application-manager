package org.jagjeet.cam.service;

import java.util.Optional;

import org.jagjeet.cam.dao.UserDaoImpl;
import org.jagjeet.cam.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDaoImpl userDaoImpl;

	private final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.cam.service.UserService#addUser(org.jagjeet.cam.model.User)
	 */
	@Override
	public User addUser(User user) {
		log.info("Inside addUser");
		return userDaoImpl.addUser(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.cam.service.UserService#getUserById(int)
	 */
	@Override
	public Optional<User> getUserById(int userId) {
		log.info("Inside getUserById");
		return userDaoImpl.getUserById(userId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.cam.service.UserService#getAllUser()
	 */
	@Override
	public Iterable<User> getAllUser() {
		log.info("Inside getAllUser");
		return userDaoImpl.getAllUser();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.cam.service.UserService#getUserByName(java.lang.String)
	 */
	@Override
	public User getUserByName(String userName) {
		return userDaoImpl.getUserByName(userName);
	}

}
