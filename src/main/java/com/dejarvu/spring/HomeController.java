package com.dejarvu.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dejarvu.spring.domain.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		logger.info("Welcome home!");
		return "home";
	}

	@RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
	public @ResponseBody
	User getUser(@PathVariable("username") String userName) {
		logger.warn("username =" + userName);
		User user = new User(userName, "eric", "cantori");
		return user;
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public @ResponseBody
	User saveUser(@RequestBody User user) {
		logger.warn("saving user:" + user);
		return user;
	}
	
	@RequestMapping(value = "/user/{username}", method = RequestMethod.DELETE)
	public @ResponseBody
	String deleteUser(@PathVariable("username") String userName) {
		logger.warn("Deleting user =" + userName);
		return userName;
	}}
