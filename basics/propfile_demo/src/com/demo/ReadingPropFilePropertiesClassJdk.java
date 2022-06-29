package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropFilePropertiesClassJdk {
	
	public static void main(String[] args) throws IOException {
		//how to read a prop file
		//used to read the prop file
		Properties properties=new Properties();
		
		
		//String nameString="raja gupta kumar"; //if u recomile the code u have to stop the server.. during that time client can not acces ur app
		//u loose ur client
		
		
		//System.out.println(nameString);
		
		
		FileInputStream fs=new FileInputStream("db.properties");
		properties.load(fs); //what happens
		
		String username= properties.getProperty("jdbc.username");
		String password= properties.getProperty("jdbc.password");
		String url= properties.getProperty("jdbc.url");
		
		String driver= properties.getProperty("jdbc.driver");
		
		String name= properties.getProperty("name");
		
		System.out.println(username);
		System.out.println(password);
		
		
		System.out.println(url);
		System.out.println(driver);
		
		System.out.println(name);
			
		
		
	}

}
