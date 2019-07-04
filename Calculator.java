package com.jala.calculator;

import java.io.*;



 class Calculator 
{

public void Calc()throws java.io.IOException

{
	boolean next = false;

	do
	{
		Integer iFirstNumber=new Integer(0);
		Integer iSecondNumber=new Integer(0);
		System.out.println("Enter the First Number");
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("***Please Enter the First Input***");
		System.out.flush();
		try {
			
		
			iFirstNumber=Integer.parseInt(buffer.readLine());
		}
		catch(NumberFormatException e)
				 {
			System.out.println("Please Enter the Number Properly");
			System.exit(0);
				 }
		
		System.out.println("Enter the Operarion");
		System.out.flush();
		
		String Option=buffer.readLine();
		
		System.out.println("Enter the Second Number ");
		System.out.flush();
		try
		{
		iSecondNumber=Integer.parseInt(buffer.readLine());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please enter the Number Properly");
			System.exit(0);
		}
		
		if(Option.length()==1)
		{
			 Calculate c=new  Calculate(iFirstNumber,Option.charAt(0),iSecondNumber);
			c.doCalculation();
			c.getResult();
		}
		else
		{
			System.out.println("Operations not available,Please try anther option");
		}
		System.out.println("Would you like to calculate again  (y/n)");
		System.out.flush();
		char response=(char)buffer.read();
		if(response=='Y'||response=='y')
		{
			next=false;
		}
		else if(response=='N'||response=='n')
		{
			next=true;
		}
		
	}while(!next);
}
	}
	

	
