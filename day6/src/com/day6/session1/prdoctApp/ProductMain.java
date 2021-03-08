package com.day6.session1.prdoctApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> arrayList = new LinkedList<Product>();
	    arrayList.add(new Product(121, "Mouse", 400, "Electronics", .15));
        arrayList.add(new Product(11, "Laptop", 40000, "Electronics", .10));
        arrayList.add(new Product(119, "Keyboard", 600, "Electronics", .20));
        arrayList.add(new Product(12991, "Java book", 500, "Books", .30));
        arrayList.add(new Product(1211, "python book", 600, "Books", .20));System.out.println("-----all products----");
		
        printAllProduct(arrayList);
		System.out.println("----sorted as per discount-----");
		Collections.sort(arrayList,new ProdcutSorterAsPerDiscount());
		printAllProduct(arrayList);
		
		System.out.println("----sorted as per name-----");
		Collections.sort(arrayList,new ProdcutSorterAsPerName());
		printAllProduct(arrayList);
		
		System.out.println("----sorted ProdcutSorterAsPerCatogeryAndAsPerDiscount-----");
		Collections.sort(arrayList,new ProdcutSorterAsPerCatogeryAndAsPerDiscount());
		printAllProduct(arrayList);
	}

	private static void printAllProduct(List<Product> arrayList) {
		for(Product p:arrayList){
			System.out.println(p);
		}
	}

}
