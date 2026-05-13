package com;

import java.util.ArrayList;
import java.util.LinkedList;

class Ex1
{
	public static void main1() 
	{

		ArrayList l = new ArrayList();
		l.add(1.5);
		l.add("java");
		l.add(10);
		l.add('a');

		for(Object ob : l)
		{
			System.out.println(ob);
		}
	}
}

class Ex2
{
	public static void main2()
	{
		int a =25;
		double b = 1.00;

		ArrayList l2 = new ArrayList();
		l2.add(a);
		l2.add(b);

		for(Object ob : l2)
		{
			System.out.println(ob);
		}
	}
}

class Ex3
{
	public static void main3()
	{
		ArrayList A = new ArrayList();
		A.add(10);
		A.add(20);

		LinkedList L = new LinkedList();
		L.addAll(A);
		L.add(30);

		System.out.println(L.containsAll(A));
		System.out.println("L is "+L);
		System.out.println("A is "+A);
		L.removeAll(A);
		System.out.println(L);
	}
}

class Ex4
{
	public static void main4()
	{
		ArrayList A = new ArrayList<>();
		A
	}



public class HeterogeniousObject {

	public static void main(String[] args) {

		Ex1.main1();
		System.out.println("------------------------------------------------------------------");
		Ex2.main2();
		System.out.println("------------------------------------------------------------------");
		Ex3.main3();

	}

}
