package com.fomedco.ete;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int num = 12345;
		
		while(num!=0) {
			
			int d = num%10; //extracting digit
			
			int reverse = d*10+d;
			
			System.out.println(reverse);
			
			num = num/10;
			
		}

	}

}
