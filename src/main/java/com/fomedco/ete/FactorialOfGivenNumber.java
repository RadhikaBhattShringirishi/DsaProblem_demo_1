package com.fomedco.ete;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		
		int num=5;
		long factorial = 1;
		long sum=0;
		for(int i = 1; i<num; i++) {
			
			factorial = factorial*i;
			sum = sum+factorial;
			
		}
		if(sum==num) {
			System.out.println("Number is strong number");
		}else {
			System.out.println("not a strong number");
		}
		

	}

}
