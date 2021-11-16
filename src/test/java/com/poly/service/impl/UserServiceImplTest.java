package com.poly.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.poly.entity.User;
import com.poly.service.UserService;

class UserServiceImplTest {
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
	final void testRegisterWithUsernameBlank() {
		String username = "";
		String password = "123456";
		String fullname = "Phạm Văn Hải";
		String email = "haipv@gmail.com";
		
		User result = userService.register(username, password, fullname, email);
	}

}
