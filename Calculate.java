package com.jala.calculator;

  class Calculate implements iCalc
{

	 char Operator;
	 int iFNum;
	 int iSNum;
	 Double dbiNumber=new Double(0);
	 Double dbiResult=new Double(0);
	 int iResult=0;
	 boolean typeDouble =false;
	 boolean typeInt=false;
	public Calculate()
	{
		
	}
	public Calculate(Double dbiNum,char cOperator )
	{
		dbiNumber=dbiNum;
		Operator=cOperator;
		typeInt = false;
		typeDouble = true;
	}
	public Calculate(int iFirstNum,char cOperator,int iSecondNum)
	{
		iFNum=iFirstNum;
		Operator=cOperator;
		iSNum=iSecondNum;
		typeInt=true;
	}
	public void  doCalculation()
	{
		iResult=0;
		dbiResult=0.0;
		switch(Operator)
		{
			
		
		case'+':
			
			iResult=iFNum+iSNum;
			break;
		case'-':
			
			iResult=iFNum-iSNum;
			break;
		case'*':
		
			iResult=iFNum*iSNum;
			break;
		case'/':
				iResult=iFNum/iSNum;
				break;
			
		case'S':
		case's':

			dbiResult=Math.sin(dbiNumber);
			
			break;
		case'C':
		case'c':

			dbiResult=Math.cos(dbiNumber);
			
			break;
		case'T':
		case't':

			dbiResult=Math.tan(dbiNumber);
			break;
		case'L':
		case'l':

			dbiResult=Math.log(dbiNumber);
			break;
		case'I':
		case'i':
			dbiResult=Math.asin(dbiNumber);
			break;
	
		default:
				iResult=0;
				dbiResult=0.0;
				System.out.println("The Operations are not available");
	}
	
	}
	
		
	
	public void getResult()
	{
		if(typeInt)
		{
			System.out.println("The Result is"+ iResult);
		}
		else if(typeDouble)
		{
			System.out.println("The Result is "  +dbiResult);
		}
	}
	boolean checkSecondNum()
		{
			if(iSNum==0)
			{
				System.out.println("Zero cannot be Second Number");
			System.exit(0);
			return true;	
		}
	else 
	{
		return false;
	}
	}
	public void checkInt1()
	{
		if(!typeInt) 
		{
			iResult=0;
			System.out.println("Operation is not valid please try again");
		}
		else if(typeDouble)
		{
			System.out.println("The Result is " + iResult);
		}
	}
	public void checkDouble()
	{
		if(!typeDouble)
	{
			dbiResult=0.0;
		System.out.println("Operation is not valid please try again");
	}
		
	}
	
	
 }
 
