package com.day5.session2;

import java.sql.SQLException;

class DataAccessException extends RuntimeException{

	public DataAccessException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
class DemoDataAccessException{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			if(1==1) {
				throw new SQLException();
			}
		}catch (Exception e) {
			// TODO: handle exception
		throw new DataAccessException(e);
	}
	}

}
