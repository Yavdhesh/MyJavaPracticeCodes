package com.hackerankProblem;

import java.math.BigDecimal;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class BeautifulDaysattheMovies {
	
	static int beautifulDays(int i, int j, int k) {
		int count=0;
		k=k%Integer.MAX_VALUE;
        for (int k2 = i; k2 <=j; k2++) {
        	int temp=k2-reverse(k2);
        	temp=temp%k;
        	//System.out.println("temp"+temp);
        	if((temp)==0){
        	//	System.out.println(temp);
    		count++;	
    		}
			
		}
		return count;
    }
	//FInally I was successful
	//condition to divide evely is M%n==0 simple, I got confused initially
	
	static int reverse(int k){
		StringBuilder sb=new StringBuilder();
		String number=k+"";
		sb.append(number.charAt(number.length()-1));
		for (int i = number.length()-2; i >= 0; i--) {
			sb.append(number.charAt(i));
		}
		//System.out.println(sb.toString());
		
		return Integer.parseInt(sb.toString());
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
        
       
        
    }

}
