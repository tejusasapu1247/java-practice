package com.day11.session1;

import java.util.function.LongConsumer;
import java.util.stream.LongStream;

public class DemoParallel {

	public static void main(String[] args) {
		//Accumulation
//		long sum=0L;
//		for(long i=1L;i<=1000_000L;i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
////	}
//		long[] sum=new long[] {0L};
//		//System.out.println(sum[0]);
//		//race condition
//		LongStream.rangeClosed(1, 1000_000).parallel().forEach(value-> sum[0]+=value);
//		System.out.println(sum[0]);
//		
//		
	//	long start=System.currentTimeMillis();
		long start=System.currentTimeMillis();
		long sumUsingReduction=LongStream.rangeClosed(1, 1000_000_000)
				                          .reduce(0, (x,y)->x+y);
		long end=System.currentTimeMillis();		
		System.out.println("time taken : "+ (end-start));
		System.out.println("sum : "+sumUsingReduction);
		
	}
}
