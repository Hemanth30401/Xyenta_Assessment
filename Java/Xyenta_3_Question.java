package com.xyenta;

import java.util.ArrayList;
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
		List al = new ArrayList<>();
		String s = sc.nextLine();
		for(int x=0;x<s.length();x++)
		{
			al.add(s.charAt(x));
		}
		String a[] = s.split(" ");
		String b[] = { "/", "*", "+", "-","%","|"};
		double x = 0, y = 0, result = 0;
		boolean[] c = new boolean[a.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 1; j < a.length; j += 2) {
				if (c[j] == true)
					continue;
				if (b[i].equals(a[j])) {
					int m = j - 1;
					if (c[m] == false) {
						x = Double.parseDouble(a[m]);
					} else {

						while (c[m] == true) {
							m--;
						}
						x = Double.parseDouble(a[m]);
					}
					int flag = 0;
					if (m > 0 && a[m - 1].equals("-")) {
						flag = 1;
						x = -1 * x;
					}
					int n = j + 1;
					if (c[n] == false) {
						y = Double.parseDouble(a[n]);
					} else {

						while (c[n] == true) {
							n++;
						}
						y = Double.parseDouble(a[n]);
					}
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
					if (result > 0 && flag == 1) {
						a[m - 1] = "+";
						flag = 0;
					} else if (result < 0 && flag == 1) {
						result = result * -1;
						flag = 0;
					}
					a[n] = String.valueOf(result);
					c[m] = true;
					c[j] = true;
					i = -1;
					break;
				}
			}
		}
		double z = 0;
		int l = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] != true) {
				z = Double.parseDouble(a[i]);
			}
		}
		l = (int) z;
		if (l == z) {
			System.out.println(l);
		} else
			System.out.println(z);

	}
}
