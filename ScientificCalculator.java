package com.jala.calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ScientificCalculator extends Calculate
{
char Operator;
Double dbiNumber=new Double(0);
ScientificCalculator()
{
}
ScientificCalculator(Double dbiNumber,char Operator)	
{
	super(dbiNumber,Operator);
	this.Operator=Operator;
	this.dbiNumber=dbiNumber;
}
public void Calc()throws java.io.IOException
{
	boolean next;
	do
	{
		Double d=new Double(0);
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Operation");
		System.out.flush();
		String option = null;

		try
		{
			
			 option=String.valueOf(buffer.readLine());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please Enter the Operation ( Sin ,Cos ,Tan ) properly");
			System.out.flush();
		}
		
		System.out.println("Enter the value");
		System.out.flush();

		
		try
		{
			
			d=Double.valueOf(buffer.readLine());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please Enter the number properly");
			System.out.flush();
		}
		if(option.length()==3)
		{
			ScientificCalculator s=new ScientificCalculator(d,option.charAt(0));
			s.doCalculation();
			s.getResult();
		}
		else
		{
			System.out.println("Option not available ,Please select valid operation");
		}
		System.out.println("Would you like to calculate again(yes/no)");
		System.out.flush();
		
		char k=(char)buffer.read();
		if(k=='Y'||k=='y')
		{
			next=false;
		}
		else
		{
			next=true;
		}
		
		
		
		
	}while(!next);
}
}
