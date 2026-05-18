package com.patterns.extra;

import java.util.ArrayList;

public class Arraylist1 
{

	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(1.5);
		a.add("string java");
		a.add(null);
		a.add('A');
		
		System.out.println(a);
		System.out.println(a.indexOf(1.5));
		System.out.println(a.contains("java"));
		System.out.println(a.lastIndexOf(null));
		System.out.println(a.remove(1));
		System.out.println(a);
		System.out.println(a.isEmpty());
		a.clear();
		System.out.println(a.isEmpty());
		
	}

}
