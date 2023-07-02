package com.practice;

import java.util.ResourceBundle;

public class ReadPropertiesFileUsingResourceBundleClass19 {

	public static void main(String[] args) {
		ResourceBundle rb=ResourceBundle.getBundle("F:\\Java\\Programs\\KrishnaSakinala\\config.properties");
		System.out.println("UserName is: "+rb.getString("userName"));
		System.out.println("Password is: "+rb.getString("password"));
	}

}
