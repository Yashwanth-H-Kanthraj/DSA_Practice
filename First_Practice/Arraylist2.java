package com;
import java.util.*;
public class Arraylist2 
{

	public static void main(String[] args) 
	{
		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);

		ArrayList y = new ArrayList(x);
		y.add(30);
		y.add(40);

		System.out.println(x);
		System.out.println(y);
	}
}
