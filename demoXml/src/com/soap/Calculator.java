package com.soap;

import javax.jws.WebMethod;
@webService
public class Calculator {
@WebMethod
public int add(int a,int b) {
	return a+b;
					
}

}
