package com.evenodd.demo;

import java.util.Scanner;

public class Sum_Even_Odd {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter N number");
		int N=sc.nextInt();
		
		if (N%2==0) {
			System.out.println("Sum of Even digit="+(N+N));
		}
		
		else if(N%2!=0) {
			System.out.println("Sum of odd digit="+(N+N));
		}
		
		else {
			System.out.println("Enter the digit");
		}
	}
}
