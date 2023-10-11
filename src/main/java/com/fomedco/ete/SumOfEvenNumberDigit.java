package com.fomedco.ete;

import java.util.Scanner;

public class SumOfEvenNumberDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter One Number");
		int num= sc.nextInt(); //taking input from the user
		
		int sum= 0;
		
		while(num!=0) {
			
		
		int d= num%10; //extracting a digit
		if(d%2==0) {
			
			sum = sum+d;
			System.out.println(sum);
			
			
		}else {
			
			System.out.println("Number is ODD");
		}
		num=num/10;
		
		}

	}

}
