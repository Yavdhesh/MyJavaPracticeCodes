package com.hackerankProblem;

import java.util.Arrays;
import java.util.Scanner;

public class HurdlesAPersonCanJumpWithMagicDrink {
	 static int hurdleRace(int k, int[] height) {
	        int count=0;
	        Arrays.sort(height);
	        for (int i = 0; i < height.length; i++) {
				System.out.print( height[i]+" ");
			}
	      //  int current=height[height.length-1]-k;
	       // return current;
	    for (int i=height.length-1;i>=0;i--){
	    
	    		
	        if(height[i]>=k){
	            count++;
	        }
	    	}
	     
	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int[] height = new int[n];
	        for(int height_i = 0; height_i < n; height_i++){
	            height[height_i] = in.nextInt();
	        }
	        int result = hurdleRace(k, height);
	        System.out.println(result);
	        in.close();
	    }
}
