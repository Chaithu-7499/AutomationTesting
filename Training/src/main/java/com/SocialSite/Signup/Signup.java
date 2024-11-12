package com.SocialSite.Signup;


public class Signup {
	public static boolean name(String name) {
		if(name.equals("smith"))
			return true;
		return false;
	}
	public static boolean surName(String surName) {
		if(surName.equals("mittal"))
			return true;
		return false;
	}
	public static boolean dob(String dob) {
		if(dob.equals("2022/10/10"))
			return true;
		return false;
	}
	public static boolean mobNo(long mobNo) {
		if(mobNo==7788994455l)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Signup s= new Signup();
	}
}
