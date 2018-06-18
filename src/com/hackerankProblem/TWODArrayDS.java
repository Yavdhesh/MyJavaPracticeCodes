package com.hackerankProblem;

import java.util.Scanner;

public class TWODArrayDS {

	public static void main(String[] args) {
		int matrix [][]=new int[6][6];
		Scanner sc =new Scanner(System.in);
		int x=0;
		
		
		while(x<6){
			int y=0;
			while(y<6){
				matrix[x][y]=sc.nextInt();
				y++;
			}
			
			x++;
		}
int c=0;
		int sum=Integer.MIN_VALUE;
		for (int i = 0; i <=3; i++) {
			for (int j = 0; j <= 3; j++) {
				int sumTemp=matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+matrix[i+1][j+1]+matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
				if(sumTemp>=sum){
					sum=sumTemp;
				}
				//System.out.println(sum);
				c++;
				
			}
		}
		System.out.println(sum);
		System.out.println(c);
	}

}
