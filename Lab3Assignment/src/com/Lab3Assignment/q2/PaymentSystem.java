package com.Lab3Assignment.q2;

import com.Lab3Assignment.q1.*;

public class PaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InVoice invoice=new InVoice("2", "stationary", 45,1000.0);
		System.out.println("total payment= "+invoice.getPayment());
		SalariedEmployee Semp=new SalariedEmployee(2,20000);
		System.out.println("Salaried Employee payment= "+Semp.getPayment());
		CommisionEmployee Cemp=new CommisionEmployee(2,200,20000);
		System.out.println("Commision Employee payment= "+Cemp.getPayment());
		HourlyEmployee Hemp=new HourlyEmployee(3,5,20000);
		System.out.println("Hourly Employee payment= "+Hemp.getPayment());
	
	
	
	}

}
