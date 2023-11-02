package com.xyenta;

import java.util.Scanner;

public class Xyenta_2_Question 
{
	public int method2(String a) 
	{
		int sum=0;
		for(int x=0;x<a.length();x++) 
		{
			switch(a.charAt(x)) 
			{
				case 'A','E','I','L','N','O','R','S','T','U':
					sum+=1;
				break;
				case 'D','G':
					sum+=2;
				break;
				case 'B','C','M','P':
					sum+=3;
				break;
				case 'F','H','V','W','Y':
					sum+=4;
				break;
				case 'K':
					sum+=5;
				break;
				case 'J','X':
					sum+=8;
				break;
				case 'Q','Z':
					sum+=10;
				break;
				default:
					System.out.println("Invalid Option");
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Xyenta_2_Question a = new Xyenta_2_Question();
		System.out.println("Enter Player 1:");
		String p1= sc.next();
		p1=p1.toUpperCase();
		
		System.out.println("Enter Player 2:");
		String p2 = sc.next();
		p2=p2.toUpperCase();
		int player1 = a.method2(p1);
		int player2 = a.method2(p2);
		if(player1==player2)
		{
			System.out.println("Tie!");
		}
		else if(player1>player2)
		{
			System.out.println(p1 + " win by " + player1 + " points.");
		}
		else
		{
			System.out.println(p2 + " win by " + player2 + " points.");
		}
	}

}
