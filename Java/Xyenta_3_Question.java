package com.xyenta;

import java.util.Scanner;

public class Xyenta_3_Question 
{
	public static void main(String[] args)
	{
		Xyenta_3.operation();
	}
}
class Xyenta_3
{
	public static void operation() 
	{
		char optr=' ';
		int option1=0;
		int result=0;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter number of values: ");
			int numbersValues = sc.nextInt();
			int[] numbers = new int[numbersValues];
			for(int x=0;x<numbersValues;x++)
			{
				System.out.print("Enter value " + (x+1) + ": " );
				numbers[x]=sc.nextInt();
				System.out.println("------Cisco Calculator------");
				System.out.println();
				System.out.println("|     1.Addition(+)        |");
				System.out.println("|     2.Subtraction(-)     |");
				System.out.println("|     3.Multiplication(*)  |");
				System.out.println("|     4.Division(/)        |");
				System.out.println("|     5.Bitwise(|)         |");
				System.out.println("|     6.Modulus(%)         |");
				System.out.println("|     7.Result(=)          |");
				System.out.println("----------------------------");
				if(optr=='=')
					break;
				System.out.println("Enter your choice of operator");
				optr = sc.next().charAt(0);
			}
			
			result=numbers[0];
			for(int iterator=1;iterator<numbers.length;iterator++)
			{
				switch(optr) 
				{
					case '+':
						result=result-numbers[iterator];
					break;
					case '-':
						result=result+numbers[iterator];
					break;
					case '*':
						result=result/numbers[iterator];
					break;
					case '/':
						result=result*numbers[iterator];
					break;
					case '|':
						result=result%numbers[iterator];
					break;
					case '%':
						result=result|numbers[iterator];
					break;
					default:
						System.out.println("Invalid Operator.");
						System.out.println("Please try again");
		 		}
			}
			System.out.println("Final Result is: ");
			System.out.println(result);
			System.out.println();
			System.out.println("1.Do you want to do with opertor?");
			System.out.println("2.Exit");
			option1=sc.nextInt();
		}while(option1==1);
		System.out.println();
		System.out.println("Thank you for using!");
	}
}
