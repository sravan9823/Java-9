package com.sravanit.login;

import com.sravanit.loginvalidation.LoginValidation;

//Project By TCS

public class Example {

	public boolean validateUserNamePwd(String userName, String pwd) {

		LoginValidation lv = new LoginValidation();

		return lv.validateUserNamePwd(userName, pwd);
	}

}
