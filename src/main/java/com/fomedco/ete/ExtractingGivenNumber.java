package com.fomedco.ete;

//Java Program to Extract Digits from A Given Integer
public class ExtractingGivenNumber {

	public static void main(String[] args) {
		
		int num = 12345;
		
		while(num>0) {
			
			int digit = num%10; //extracing a digit
			System.out.println(digit);
			
			num = num/10; //wating for number to be zero
			
			
		}

	}

}
