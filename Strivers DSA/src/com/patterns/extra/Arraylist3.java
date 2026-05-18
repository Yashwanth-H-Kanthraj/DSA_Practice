package com.patterns.extra;

import java.util.ArrayList;

public class Arraylist3 {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add(105);
		a.add(10.25845);
		a.add("java ");

		System.out.println(a);
		System.out.println("-----------------------------------------------------------");
		for (int i = 0; i < a.size(); i++) 
		{
			System.out.println(a.get(i));			
		}

		System.out.println("-----------------------------------------------");

		for (int i = a.size()-1; i >= 0; i--) 
		{
			System.out.println(a.get(i));	
		}
	}

}
