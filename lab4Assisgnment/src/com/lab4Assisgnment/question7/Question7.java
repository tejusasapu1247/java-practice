package com.lab4Assisgnment.question7;

import java.io.IOException;
class InputException extends Exception{

	public InputException(String message) {
		super(message);
		}
}
class DemoException{
	public void throwException() {
		try {
			throw new InputException("This is Input exception");
		} catch (InputException e) {
			e.printStackTrace();
		}
		try {
			throw new IOException("This is an IOException");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Question7 {

	public static void main(String[] args) {
		DemoException demoEx=new DemoException();
		demoEx.throwException();
	}

}
/*Initially for "IOException" suggested me to import 
 * the "java.io.IOException" because it is checked exception.
 * 
 * For "InputException" it is asking to create a Class called 
 * InputException because it is a custom exception that we need to resolve.
 * 
 * 
 *
 *
 *
 *
 */





