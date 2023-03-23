package com.cjc.model;

import java.util.Scanner;

public class Laptop //default class can not access so i change it to in public

{
	private int modelno;
	private String lname;
	private double lprize;
	
public void in()
{  
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Model no = ");
	modelno=sc.nextInt();
	System.out.print("Enter name = ");
	lname=sc.next();
	System.out.print("Enter Prize = ");
	lprize=sc.nextDouble();
	System.out.println();
}
	protected void out()
	{
		System.out.println("***** LAPTOP DETAILS ******"); 
		System.out.println("________________________________");
		System.out.println("Model No is = "+modelno);
		System.out.println("Model Name is = "+lname);
		System.out.println("Prize is = "+lprize);
	}
}

