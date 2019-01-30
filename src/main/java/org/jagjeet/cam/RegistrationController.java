package org.jagjeet.cam;

import java.util.Optional;

import org.jagjeet.cam.model.User;
import org.jagjeet.cam.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Developer
 *
 */
@RestController
public class RegistrationController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	/**
	 * @param user
	 * @return
	 */
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return userServiceImpl.addUser(user);
	}

	/**
	 * @return
	 */
	@GetMapping("/user")
	public Iterable<User> getAllUser() {
		return userServiceImpl.getAllUser();
	}

	/**
	 * @param userId
	 * @return
	 */
	@GetMapping("/user/{userId}")
	public Optional<User> getUser(@PathVariable int userId) {
		return userServiceImpl.getUserById(userId);
	}
	
}
