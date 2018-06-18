package com.hackerankProblem;

import java.util.Scanner;

public class UtopianTree {
	
	 static int utopianTree(int n) {
	        // Complete this function
		 int height=1;
		 for (int i = 1; i <= n; i++) {
			if(i%2!=0){
				height=2*height;
			}else if(i%2==0){
				height=height+1;
			}
		}
		 
		 return height;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            int result = utopianTree(n);
	            System.out.println(result);
	        }
	        in.close();
	    }

}
