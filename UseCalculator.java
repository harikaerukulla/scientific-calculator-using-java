package com.jala.calculator;

import java.io.*;


public class UseCalculator 
{
	public static void main(String args[])throws java.io.IOException
	{
		BufferedReader m=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Select the operation Basic -'B',Scientific -'S'");
		System.out.flush();
		BufferedReader buffer = null;
		String option = null;

		try {
		option=m.readLine();
		}
		catch(NullPointerException e) {
		}
		
		if(option.length()==1)
		{
			if(option.equals("B")||option.equals("b"))
			{
				Calculator c=new Calculator();
				c.Calc();
			}
			else if(option.equals("S")||option.equals("s"))
			{
				ScientificCalculator ss=new ScientificCalculator();
				ss.Calc();
			}
			else {
				System.out.println("**Please enter the Option for B or S");
			}
		}
		
		
		
	}
}