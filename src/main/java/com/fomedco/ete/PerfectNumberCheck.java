package com.fomedco.ete;

public class PerfectNumberCheck {

	public static void main(String[] args) {

//          perfect number is a number some of all divisors,except that number equalt to original
           int num = 7;
           int sum = 0;
           for(int i = 1; i<num; i++) {
        	   
        	   if(num%i==0) {
        		   
        		   sum = sum+i;
        		   
        		   
        	   }
        	   
        	   
        	   
           }
           
           if(sum==num) {
        	   
        	   System.out.println("Its perfect number");
        	   
           }else {
        	   System.out.println("Its not a perfect number");
           }
	}

}
