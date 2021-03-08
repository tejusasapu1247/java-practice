package com.day7.session2;
import java.io.*;
import java.util.Properties;
public class DemoProperties {

	public static void main(String[] args) {
		Properties p=new Properties();
		InputStream is =DemoProperties.class.getResourceAsStream("info.properties");
		try {
			p.load(is);
			System.out.println(p.getProperty("name"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
