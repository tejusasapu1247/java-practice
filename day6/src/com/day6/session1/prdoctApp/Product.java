package com.day6.session1.prdoctApp;

import java.util.Comparator;

class ProdcutSorterAsPerCatogeryAndAsPerDiscount implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		int val = o1.getModel().compareTo(o2.getModel());
		if (val == 0) {
			val = Double.compare(o2.getDiscount(), o1.getDiscount());

		}
		return val;
	}
}

class ProdcutSorterAsPerDiscount implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getDiscount(), o1.getDiscount());
	}
}

class ProdcutSorterAsPerName implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getpName().compareTo(o2.getpName());
	}
}

public class Product {
	private int id;
	private String pName;
	private double pType;
	private String model;
	private double discount;

	public Product(int id, String pName, double pType, String model, double discount) {
		super();
		this.id = id;
		this.pName = pName;
		this.pType = pType;
		this.model = model;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getpType() {
		return pType;
	}

	public void setpType(double pType) {
		this.pType = pType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pName=" + pName + ", pType=" + pType + ", model=" + model + ", discount="
				+ discount + "]";
	}

}