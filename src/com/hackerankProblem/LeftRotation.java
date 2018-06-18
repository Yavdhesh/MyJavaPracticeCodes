package com.hackerankProblem;

import java.util.Scanner;

public class LeftRotation {

	 static int[] leftRotation(int[] a, int d) {
	        d=d%a.length;
	        int [] temp=new int[d];
	        for (int i = 0; i < temp.length; i++) {
				temp[i]=a[i];
			}
	        
	        for (int i = d; i < a.length; i++) {
				a[i-d]=a[i];
			}
	        
	        for (int i = 0; i < temp.length; i++) {
				a[a.length-d+i]=temp[i];
			}
	        
	        
	        return a;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int d = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i = 0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int[] result = leftRotation(a, d);
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
	        }
	        System.out.println("");


	        in.close();
	    }


}
