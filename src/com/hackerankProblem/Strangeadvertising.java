package com.hackerankProblem;

import java.util.Scanner;

public class Strangeadvertising {
	
	 static int viralAdvertising(int n) {
	        // Complete this function
		 int init=2;
		 int factor=3;
		 int sum=init+factor;
		 if(n==2){
			 return 5;
		 }
		 if(n==1){
			 return 2;
		 }
		 
		 int c=0;
		 int k=3;
		 for (int i = 2; i <=n; i++) {
			 if(c==0){
			c=((factor)*(3)/(2));
			 }else{
				 c=((c)*(3/2));
			 }
			
			System.out.println(c);
		}
		 return sum+c;
		 
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int result = viralAdvertising(n);
	        System.out.println(result);
	        in.close();
	    }	

}
