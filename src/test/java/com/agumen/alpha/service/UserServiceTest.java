package com.agumen.alpha.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.agumen.alpha.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	public void testHasMatchUser(){
		boolean b1 = userService.hasMatchUser("admin", "passw");
		boolean b2 = userService.hasMatchUser("admin", "admin");
		assertTrue(!b1);
		assertTrue(b2);
	}

	@Test
	public void testFindUserByUserName(){
		User user = userService.findUserByUserName("admin");
		assertEquals(user.getUserName(), "admin");
	}
}
