package com.xyenta;


import java.util.Scanner;

public class Xyenta_1_Question 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height of the left pattern: ");
		int height1=sc.nextInt();
		Xyenta_1_a.leftTriangle(height1);
		System.out.println();
		System.out.println("Enter Height of the pattern: ");
		int height2=sc.nextInt();
		Xyenta_1_c xyenta = new Xyenta_1_c();
		xyenta.rightTriangle(height2);
	}
}

class Xyenta_1_a
{
	public static void leftTriangle(int height1)
	{
		for(int x=1;x<=height1;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}
}

class Xyenta_1_c
{
	public void rightTriangle(int height2)
	{
		for(int x=1;x<=height2;x++)
		{
			for(int y=height2;y>x;y--)
			{
				System.out.print(" ");
			}
			for(int z=1;z<=x;z++)
				System.out.print("#");
			System.out.println();
		}
	}
}
