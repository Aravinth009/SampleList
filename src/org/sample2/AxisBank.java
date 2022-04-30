package org.sample2;

import java.util.LinkedList;
import java.util.List;

public class AxisBank {
	public static void main(String[] args) {
		List li = new LinkedList<>();

		li.add(10);
		li.add("Java");
		li.add('a');
		li.add(984357654.8765f);
		li.add(778899898);
		li.add(23333333.333d);
		li.add(true);
		li.add(10);
		System.out.println(li);
		int size = li.size();
		System.out.println(size);
		Object object = li.get(5);
		System.out.println(object);
		li.remove(3);
		System.out.println(li);
		li.add(2, 300);
		System.out.println(li);
		li.set(1, "selenium");
		System.out.println(li);
		boolean contains = li.contains(10);
		System.out.println(contains);
		int indexOf = li.indexOf(10);
		System.out.println(indexOf);
		int a = li.lastIndexOf(10);
		System.out.println(a);
		int o = li.indexOf("python");
		System.out.println(o);
		boolean empty = li.isEmpty();
		System.out.println(empty);
		System.out.println("*******************");
		// to iterate list

		System.out.println("for loop");

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));

		}
		System.out.println("*******************");
		System.out.println("enhanced for loop");
		for (Object x : li) {
			System.out.println(x);

		}
System.out.println("aravinth");
System.out.println("ara@123");
System.out.println("password");
System.out.println("Jhansi");
System.out.println("Brindha");
System.out.println("Boopathi");
	}



}

