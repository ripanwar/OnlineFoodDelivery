package com.cg.fds.repository.implementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.cg.fds.entities.Login;
import com.cg.fds.service.implementation.ILoginServiceImpl;

class ILoginRepositoryImplTest {
	Login login;
	ILoginRepositoryImpl iLoginRepo;
	
	@Before
	public void setup() {
		login=new Login();
		iLoginRepo=new ILoginRepositoryImpl();
		login.setUserid("1");
		login.setUserName("capg");
		login.setPassword("capg");
	}
	@Test
	void testSignIn() {
		assertEquals(login.getUserid(), iLoginRepo.signIn(login).getUserid());
	}

	@Test
	void testSignOut() {
		assertEquals(login.getUserid(), iLoginRepo.signOut(login).getUserid());
	}

}
