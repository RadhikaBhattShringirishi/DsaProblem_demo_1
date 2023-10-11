package com.fomedco.ete;

//Java program to Count the number of digits in a given integer
public class Count_The_Number_Of_Digits {

	public static void main(String[] args) {
		
		int count=0;
		
		int num = 123684;
		while(num!=0) {
			
			num = num/10;
			count = count+1;
			
			
			
		}
		
		System.out.println(count);
		

	}

}
