package org.jagjeet.cam.dao;

import java.util.Optional;

import org.jagjeet.cam.model.User;
import org.jagjeet.cam.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserRepository userRepository;

	private final Logger log = LoggerFactory.getLogger(UserDaoImpl.class);

	/* (non-Javadoc)
	 * @see org.jagjeet.cam.dao.UserDao#addUser(org.jagjeet.cam.model.User)
	 */
	@Override
	public User addUser(User user) {
		log.info("Inside addUser");
		return userRepository.save(user);

	}

	/* (non-Javadoc)
	 * @see org.jagjeet.cam.dao.UserDao#getUserById(int)
	 */
	@Override
	public Optional<User> getUserById(int userId) {
		log.info("Inside getUseryId");
		return userRepository.findById(userId);
	}

	/* (non-Javadoc)
	 * @see org.jagjeet.cam.dao.UserDao#getAllUser()
	 */
	@Override
	public Iterable<User> getAllUser() {
		log.info("Inside getAllUser");
		return userRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see org.jagjeet.cam.dao.UserDao#getUserByName(java.lang.String)
	 */
	@Override
	public User getUserByName(String userName) {
		return userRepository.getUserByName(userName);
	}
}
