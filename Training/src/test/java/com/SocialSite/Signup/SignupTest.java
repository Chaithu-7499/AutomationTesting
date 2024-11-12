package com.SocialSite.Signup;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SignupTest {
	
	@Test
	public void shouldAnswerWithTrue()
	{
		assertTrue(Signup.name("smith") && Signup.surName("mittal") && Signup.dob("2022/10/10") && Signup.mobNo(7788994455l));
	}
//	@Test
//	public void answerWithFalse() {
//		assertTrue(Signup.name("smi") && Signup.surName("mittal") && Signup.dob("2022/10/10") && Signup.mobNo(7788994455l));
//	}
}
