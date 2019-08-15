package chapter10_IO.Udemy_excel;

import java.io.*;
import java.util.Properties;

public class testCase1 {
	public static void main(String[] args) throws IOException {
	
	
	String path =System.getProperty("user.dir")+"/src/config/object.properties";
	Properties properties = new Properties();
	FileInputStream file = new FileInputStream(path);
	properties.load(file);
		System.out.println(properties.getProperty("name"));
		System.out.println(properties.getProperty("age"));
		System.out.println(System.getProperty("user.dir"));
}
	}
