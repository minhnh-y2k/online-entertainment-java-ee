package com.poly.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.poly.entity.User;
import com.poly.service.impl.UserServiceImpl;

class LoginTest {
	private UserService userService;

	@BeforeEach
	void setUp() throws Exception {
		userService = new UserServiceImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		userService = null;
	}
	
	@Test
	final void testLoginWithUserTrueAndPassTrue() {
		String username = "MinhNH";
		String password = "123456";
		
		User result = userService.login(username, password);
		
		assertNotNull(result);
	}

}
