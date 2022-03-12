package com.company;

public class fibonacci {
	public static void main(String[] args) {
		int a=1, b=1, r, c, sum=0;
		r=1;
		System.out.println("The first 20 Fibonacci numbers are: ");
		   while( r<=20 )
		   {
		     System.out.print(a +" ");
		      sum =sum+ a;
		      c = a + b;
		      a = b;
		      b = c;
		      r++;
		   }
		System.out.print("\n");   
		System.out.println("The sum of 20 fibonacci numbers: "+ sum);
		System.out.println("The average is: "+ sum/20);
	}

}

