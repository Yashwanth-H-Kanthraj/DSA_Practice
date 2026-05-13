package com;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
				
		l.add(10);
		l.add(20);
		l.add(10);
		l.add(30);
		
		System.out.println(l);
		System.out.println(l.indexOf(10));
		System.out.println(l.lastIndexOf(30));
		
		
		
	}

}
