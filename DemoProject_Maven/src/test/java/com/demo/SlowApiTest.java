package com.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SlowApiTest {
	private SlowApi slowApi;
	@Before
	public void setup() {
		slowApi=new SlowApi();
	}
	@Test(timeout=1000)
	public void slowApiTest() {
		String value=slowApi.getUpperValue("teju");
		assertEquals("TEJU", value);
	}
	@After
	public void tearDown() {
		slowApi=null;
	}
	
	

}
