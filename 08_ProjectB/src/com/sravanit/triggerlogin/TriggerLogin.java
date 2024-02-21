package com.sravanit.triggerlogin;

import com.sravanit.login.Example;

//Project By Infosys 

public class TriggerLogin {

	public static void main(String[] args) {

		Example example = new Example();
		boolean validateUserNamePwd = example.validateUserNamePwd("Sravan", "Sravan@123");
		System.out.println(validateUserNamePwd);

		// com.sravanit.loginvalidation.LoginValidation lv = new
		// com.sravanit.loginvalidation.LoginValidation();

	}

}
