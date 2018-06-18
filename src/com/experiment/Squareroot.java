package com.experiment;

import javax.swing.text.ChangedCharSetException;

public class Squareroot {
	
	public static boolean checkIfItIsASquare(long input){
		
		return input == (long)Math.sqrt(input)*(long)Math.sqrt(input);
	}
	
	public static boolean checkIfItIsAPrime(long input){
		if(input==2){
			return true;
		}
		if(input%2==0){
			return false;
		}
		
		for(long i=3;i*i<=input;i++){
			if(input%i==0){
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long l=(long) Math.sqrt(1000000);
		System.out.println(Math.sqrt(1000000));
		
		System.out.println(checkIfItIsASquare(101));
		System.out.println(checkIfItIsAPrime(683));

	}

}
