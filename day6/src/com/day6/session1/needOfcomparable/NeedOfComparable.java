package com.day6.session1.needOfcomparable;

import java.util.*;
public class NeedOfComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book>books=new ArrayList<>();
		books.add(new Book(121, "mySql", 201, 520));
		books.add(new Book(126, "angular", 300, 50));
		books.add(new Book(123, "c", 400, 50230));
		books.add(new Book(122, "core java", 400, 5100));
		books.add(new Book(120, "adv java", 200, 200));
		books.add(new Book(121, "python", 2020, 400));
		print(books);
		System.out.println("------------after sorting -----------------");
		Collections.sort(books);
		print(books);
		System.out.println("------------sorted as per title-----------------");
		Collections.sort(books,new BookSorterAsPerTitle());
		print(books);
		
		System.out.println("---------------sorted as per price--------------");
		Collections.sort(books,new BookSorterAsPerPrice());
		print(books);
		
		System.out.println("---------------sorted as per price and as per no of pages--------------");
		Collections.sort(books,new BookSorterAsPerPriceAndAsPerNoOfPages());
		print(books);
		//Here comes the comparable...
		//comparable is used for natural sort
		//wile comparator is used to 
	}

	private static void print(ArrayList<Book> books) {
		for(Book book:books) {
			System.out.println(book);
		}
	}

}
