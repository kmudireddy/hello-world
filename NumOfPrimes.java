package com.validation;

import java.util.ArrayList;
import java.util.HashSet;

public class NumOfPrimes {

	static ArrayList<Integer> primeList = new ArrayList<Integer>();
	public static void main(String[] args) {
	    int count = 0;   // count here should be count =1 as you are checking for prime excluding 2.
	    primeList.add(2);
	    for (int number = 2; number < 10; number++)
	      if (isPrime(number)){
	    	  primeList.add(number);
	        count++;
	      }
	    System.out.println("The number of prime number < 10000 is "
	      + count);
	   System.out.println("Prime List :"+ primeList.toString());
	  }

	  /** Check whether number is prime */
	  public static boolean isPrime(int number) {
	    /*for (int divisor = 2; divisor <= number / 2; divisor++) {
	      if (number % divisor == 0) { // If true, number is not prime
	        return false; // number is not a prime
	      }
	     
	    }*/
		  
		  //Alternatively you can add primes to PrimeList and get either list or size if you need. 
		  for(int divisor:primeList){
			  if (number % divisor == 0) { // If true, number is not prime
			        return false; // number is not a prime
			      }
		  }

	    return true; // number is prime
	  }
	
}
