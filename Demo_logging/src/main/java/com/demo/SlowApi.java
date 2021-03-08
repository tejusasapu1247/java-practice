package com.demo;

public class SlowApi {

	public String getUpperValue(String val) {
		try {
			Thread.sleep(200);
			
		}catch (Exception e) {
			
		}
		return val.toUpperCase();
	}
 
}
