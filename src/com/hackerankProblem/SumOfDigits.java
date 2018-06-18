package com.hackerankProblem;

import java.math.BigInteger;
import java.util.Scanner;

public class SumOfDigits {
	
	public static int superFinder(String n){
		if(n.length()>1){
			int sum=0;
			for (int i = 0; i < n.length(); i++) {
				sum=(sum+Character.getNumericValue(n.charAt(i)))%9;
			}
			n=sum+"";
			if(n.length()==1){
				return sum;
			}
			return superFinder(n);
		}else{
			
			return Character.getNumericValue(n.charAt(0));
		}
			
	}
	
	public static int superDigitFinder(String n,int k){
		int count=0;
		StringBuilder sb=new StringBuilder();
		int sum=0;
		while(count<k){
			//sb.append(n);
			count++;
			sum=sum+superFinder(n);
		}
		n=sum+"";
		while(n.length()>1){
			int sum1=0;
			for (int i = 0; i < n.length(); i++) {
				sum1=(sum1+Character.getNumericValue(n.charAt(i)))%9;
			}
			n=sum+"";
			if(n.length()==1){
				sum=sum1;
				break;
			}
			
		}
		
		return sum;
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int k=sc.nextInt();
		int count=0;
		StringBuilder sb=new StringBuilder();
		/*while(count<k){
			sb.append(n);
			count++;
		}*/
		
		
		//superb concept
		
		//sum of digits of a number until a single digit is obtained is equal to number % 9.. vedic maths
		
		//System.out.println((Long.valueOf(n)*k)%9);
	
		BigInteger b=new BigInteger(n);
		b=b.multiply(new BigInteger(k+""));
		b=b.mod(new BigInteger(9+""));
		if(b.equals(new BigInteger("0"))){
			System.out.println(9);
		}else{
			System.out.println(b);
		}
		
		//System.out.println(superDigitFinder(n,k));
		//System.out.println(sb.toString());
		//System.out.println(Character.getNumericValue(sb.toString().charAt(0))/*(sb.toString().charAt(0))+(sb.toString().charAt(0))*/);
		
		

	}

}
