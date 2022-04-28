package org.sample2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {
public static void main(String[] args) {
	List <String>li = new ArrayList<String>();
	li.add("Parthiban");

	li.add("Srithar");
	li.add("Aravinth");
	li.add("Krishna");
	
	li.add("Sivaram");
	System.out.println(li);
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i));
		  
	}
	
	Collections.sort(li);


System.out.println(li);
li.sort( Collections.reverseOrder());  
System.out.println(li);
}


}
