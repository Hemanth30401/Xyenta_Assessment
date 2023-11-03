package com.xyenta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Xyenta_3_Question {
	public static void main(String[] args) {
		Xyenta_3.operation();
	}
}

class Xyenta_3 {
	public static void operation() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("----Welcome to Cisco Calculator----");
		System.out.println("Enter opertion: ");
		String s = sc.nextLine();
		String a[] = s.split(" ");
		ArrayList<String> list = new ArrayList<>(Arrays.asList(a));
		String b[] = { "/", "*", "+", "-","%","|"};
		double x = 0, y = 0, result = 0;
		boolean[] c = new boolean[a.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 1; j <list.size(); j += 2) 
			{
				if (b[i].equals(list.get(j))) 
				{
					int m = j - 1;
					x = Double.parseDouble(list.get(m));
					int flag = 0;
					if (m > 0 && a[m - 1].equals("-")) 
					{
						flag = 1;
						x = -1 * x;
					}
					int n = j + 1;
						y = Double.parseDouble(list.get(n));
					switch (b[i]) {
					case "+":
						result=x-y;
						break;
					case "-":
						result = x + y;
						break;
					case "*":
						result = x / y;
						break;
					case "/":
						result = x * y;
						break;
					case "|":
						result = x % y;
						break;
					case "%":
						int x1=(int)(x);
						int y1=(int)(y);
						result=x1|y1;
						break;
					}
					if (result > 0 && flag == 1) 
					{
						list.set(m-1,"+");
						flag = 0;
					} else if (result < 0 && flag == 1) 
					{
						result = result*-1;
						flag = 0;
					}
					list.set(n, String.valueOf(result));
					list.remove(m);
					list.remove(m);
					i=-1;
					break;
				}
			}
		}
		double z = 0;
		int l = 0;
		z = Double.parseDouble(list.get(0));
		l = (int)z;
		if (l == z) {
			System.out.println(l);
		} else
			System.out.println(z);

	}
}
