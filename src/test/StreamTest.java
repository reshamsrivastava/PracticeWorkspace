package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamTest {
	
	
	
	public static void main(String[] args) {
		
		
		//Filter
		List<String> list1=new ArrayList<>();
		list1.add("Resham");
		list1.add("Reishabh");
		list1.add("Raghu");
		list1.add("xyz");
		
		Optional<String> res= list1.stream().filter(s -> s.equalsIgnoreCase("resham")).findAny();
		System.out.println("Result"+res);

		
		//Calculate sum of integer
		List<Integer> listInt=new ArrayList<>();
		listInt.add(1);
		listInt.add(2);
		listInt.add(3);
		
		int sum1=listInt.stream().mapToInt(i -> i.intValue()).sum();
		
		// parrallerStream
		int sum=listInt.parallelStream().reduce(0, Integer::sum);
		int sum2=listInt.parallelStream().reduce(0, (a,b)-> a+b);
		
		//Max
		int max=listInt.parallelStream().reduce(0, Integer::max);
		
		
		
		System.out.println("sum"+sum);
		System.out.println("sum"+sum1);
		System.out.println("sum"+sum2);
		System.out.println("max"+max);
		
		
		
		// 
		
		
	}
	
	
	
	
	 
	
	

}
