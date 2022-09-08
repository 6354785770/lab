package hello;

import java.util.*;

public class SpecializedOpration {

	public static void main(String[] args) {
	List<String>li=new ArrayList<String>();
	li.add("10");
	li.add("60");
	li.add("70");
	li.add("110");
	li.add("100");
	OptionalInt maxNumber=li.stream().mapToInt(i ->Integer.parseInt(i)).max();
	System.out.println("maximum number is "+maxNumber);
	Double sum= li.stream().mapToDouble(i -> Double.parseDouble(i)).sum();
	System.out.println("sum of the elements"+sum);
	OptionalDouble averageofElements=li.stream().mapToDouble(i -> Double.parseDouble(i)).average();
	System.out.println("average of the element"+ averageofElements);
	
	
	List<Integer>l=new ArrayList<Integer>();
	l.add(10);
	l.add(60);
	l.add(50);
	l.add(70);
	l.add(101);
	l.parallelStream().map(num -> num+1 ).forEach(n->System.out.println(n));

	}

}
