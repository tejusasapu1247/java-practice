package com.Java8Assignment.question1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class TestingTraderTransactions {
	public static void main(String args[]) {
		
		List<Transaction> transactionList=getTransactions();
		List<Trader> cities=(List<Trader>)transactionList.stream()
                .map(s->s.getTrader())
                .distinct()
               .collect(Collectors.toList());
		//Question 1
		System.out.println("\n.......1.Find all transactions in the year 2011 and sort them by value (small to high).....");
		List<Transaction> list=transactionList.stream()
				                              .filter(s->s.getYear()==2011)
				                              .sorted((o1,o2) ->Integer.compare(o1.getValue(), o2.getValue()))
			                            	  .collect(Collectors.toList());
		list.forEach(System.out::println);	                              
		
		//Question 2
		System.out.println("\n...2.What are all the unique cities where the traders work?....");
		
		List<String> Uniquecities=(List<String>)cities.stream()
                .map(s->s.getCity())
                .distinct()
               .collect(Collectors.toList());
		Uniquecities.forEach(System.out::println);	                              

		//Question 3
		System.out.println("\n...3.Find all traders from delhi and sort them by name.....");

		List<Trader> delhiTraders=cities.stream()
                .filter(d->d.getCity().equals("delhi"))
                .sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
               .collect(Collectors.toList());
		delhiTraders.forEach(System.out::println);
		
		//Question 4
		System.out.println("\n...4.Return a string of all traders names sorted alphabetically......");
		List<Trader> traderNames=cities.stream()
                .sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
               .collect(Collectors.toList());
		traderNames.forEach(System.out::println);
		
		//Question 5
		System.out.println("\n...5.Are any traders based in Jaipur?......");
		boolean traderInJaipur= cities
				.stream()
				.anyMatch(j->j.getCity().equals("jaipur"));
		if(traderInJaipur)	System.out.println("Yes");
		else System.out.println("No");
		
		//Question 6
		System.out.println("\n...6.Print all transactions values from the traders living in delhi......");
		@SuppressWarnings("unused")
		List<Trader> delhiTraders2=cities.stream()
                .filter(s->s.getCity().equals("delhi"))
                .collect(Collectors.toList());
		List<Integer> delhiTradersList=transactionList
											.stream()
											.filter(c->c.getTrader().getCity().equals("delhi"))
											.map(e->e.getValue())
											.collect(Collectors.toList());
		delhiTradersList.forEach(System.out::println);	                              
	
		//Question 7
		System.out.println("\n...7.Whats the highest value of all the transactions?......");
		OptionalInt maxValue=transactionList
				.stream()
				.mapToInt(d->d.getValue())
				.max();
		System.out.println(maxValue.orElse(-1));
		
		//Question 8
		System.out.println("\n...8.Find the transaction with the smallest value?......");
		OptionalInt minValue=transactionList
				.stream()
				.mapToInt(d->d.getValue())
				.min();
		System.out.println(minValue.orElse(-1));
		
	}
	private static List<Transaction> getTransactions() {
		Trader ram= new Trader("ram", "delhi");
		Trader maha= new Trader("maha", "delhi");
		Trader kapil= new Trader("kapil","noida");
		Trader raj= new Trader("raj","banglore");
		Trader ekta= new Trader("ekta","banglore");
		List<Transaction> transactions = Arrays.asList(
				new Transaction(ram, 2011, 300),
				new Transaction(ram, 2012, 1000),
				new Transaction(kapil, 2011, 400),
				new Transaction(raj, 2012, 710),
				new Transaction(ekta, 2012, 700),
				new Transaction(maha, 2012, 700),
				new Transaction(ekta, 2012, 950)
		);
		return transactions;
	}
}
