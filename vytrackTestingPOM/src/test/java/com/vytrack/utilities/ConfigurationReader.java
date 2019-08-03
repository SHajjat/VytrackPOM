package com.vytrack.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
private static Properties properties;
static {
	String path = "configuration.properties";
	try {
	FileInputStream input = new FileInputStream(path);
	properties = new Properties();
	properties.load(input);
	input.close();
}catch(IOException e){
		e.getMessage();
}
}
	public static String get(String keyname){
	
	return properties.getProperty(keyname);
	}
}

