package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class prodStreamTest {

	
	public static void main(String[] args) {
		
		List<Product> prodList1=new ArrayList<>();
		List<String> list2=new ArrayList<String>();
		
		List<String> list1=new ArrayList<>();
		list1.add("Resham");
		list1.add("Rishabh");
		list1.add("Raghu");
		list1.add("xyz");
		
		Product prod=new Product("colgate","utility",50.2,2);
		Product prod1=new Product("cream","utility",100,5);
		Product prod2=new Product("chips","food",20,10);
		Product prod3=new Product("choclate","food",40,20);

		List<Product> prodList=new ArrayList<>();
		prodList.add(prod);
		prodList.add(prod1);
		prodList.add(prod2);
		prodList.add(prod3);
		
		//1. Filter
		prodList.stream().filter(p -> p.getProdName().equalsIgnoreCase("cream")).findAny();
		
		
		//2. map
		System.out.println("Map----");
		//prodList1=prodList.stream().map(p -> p.getProdPrice()).collect(Collectors.toList());
		//System.out.println("MAP List new:"+prodList1);
		
		
		//3. mapToInt
		//prodList1=prodList.stream().mapToInt()
		
		
		
		//4. distinct
		list2=list1.stream().distinct().collect(Collectors.toList());
		System.out.println("distinct List new:"+list2);
		
		//5. sorted
		list2=list1.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted List new:"+list2);
		
		//6.peek
		System.out.println("Peek----");
		prodList1=prodList.stream().peek(p -> p.applyDiscount()).collect(Collectors.toList());
		prodList1.stream().forEach(i -> System.out.println(i.getProdPrice()));
		
		//7.limit
		System.out.println("Limit----");
		prodList1=prodList.stream().limit(5).collect(Collectors.toList());
		prodList1.stream().forEach(i -> System.out.println(i.getProdName()));
		
		//8. skip
		System.out.println("Skip-------");
		prodList1=prodList.stream().skip(1).collect(Collectors.toList());
		prodList1.stream().forEach(i -> System.out.println(i.getProdName()));
		
		//9.takewhile
		System.out.println("takewhile-------");
		prodList1=prodList.stream().takeWhile(p -> !p.getProdName().equalsIgnoreCase("shjg")).collect(Collectors.toList());
		prodList1.stream().forEach(i -> System.out.println(i.getProdName()));
		
		//10.dropwhile
		System.out.println("dropwhile-------");
		prodList1=prodList.stream().dropWhile(p -> p.getProdName().equalsIgnoreCase("colgate")).collect(Collectors.toList());
		prodList1.stream().forEach(i -> System.out.println(i.getProdName()));
		
		//11.reduce
		System.out.println("reduce-------");
		//prodList1=prodList.stream().reduce
		prodList1.stream().forEach(i -> System.out.println(i.getProdName()));
		
	}
	
	void cal() {
		
	}
}
