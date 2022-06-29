package com.demo;

import java.util.Iterator;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class ReadingPropUsingCommonLogging {
	
	public static void main(String[] args) throws ConfigurationException {
		Configurations configurations = new Configurations();
		PropertiesConfiguration config = configurations.properties("db.properties");
		
		Iterator<String> keys = config.getKeys();
		while(keys.hasNext()) {
			String key= keys.next();
			System.out.println(key+": "+  config.getProperty(key));
		}
		
		Integer value1 = Integer.parseInt((String) config.getProperty("value1"));
		Integer value2 = Integer.parseInt((String) config.getProperty("value2"));
		Integer sum = value1 + value2;
		System.out.println("Sum=" + sum);
	}

}
