package com.Lab3Assignment.q2;

public class InVoice implements Payable{
	private String partNum;
	private String partDescrpition;
	private int quantity;
	private double pricePattern;
	public InVoice(String partNum, String partDescrpition, int quantity, double pricePattern) {
		super();
		this.partNum = partNum;
		this.partDescrpition = partDescrpition;
		this.quantity = quantity;
		this.pricePattern = pricePattern;
	}
	public String getPartNum() {
		return partNum;
	}
	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}
	public String getPartDescrpition() {
		return partDescrpition;
	}
	public void setPartDescrpition(String partDescrpition) {
		this.partDescrpition = partDescrpition;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPricePattern() {
		return pricePattern;
	}
	public void setPricePattern(double pricePattern) {
		this.pricePattern = pricePattern;
	}
	public void display() {
		System.out.println("partNum=" + partNum + ", partDescrpition=" + partDescrpition + ", quantity=" + quantity
				+ ", pricePattern=" + pricePattern);
	}
	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		this.display();
		return getPricePattern()*getQuantity();
	}
	
	

}
