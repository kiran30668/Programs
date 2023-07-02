package com.practice;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesFile6 {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis=new FileInputStream("F:\\Java\\Programs\\KrishnaSakinala\\config.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String userName=prop.getProperty("userName");
		String password=prop.getProperty("password");
		String fName=prop.getProperty("firstName");
		
		System.out.println(userName);
		System.out.println(password);
		System.out.println(fName);
	}

}
