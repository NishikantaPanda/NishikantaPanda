package com.practice.Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileRead {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\commonData.properties");
		Properties p = new Properties();
		p.load(fis);
		String uname = p.getProperty("username");
		String pwd = p.getProperty("password");
		String url = p.getProperty("url");
		
		System.out.println("Username is : "+uname);
		System.out.println("Password is : "+pwd);
		System.out.println("Url is : "+url);
		
	}
}
