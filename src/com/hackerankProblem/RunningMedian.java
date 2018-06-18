package com.hackerankProblem;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RunningMedian { //Not Done

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int noOfQueries=sc.nextInt();
		int count=0;
		while(count<noOfQueries){
			int value=sc.nextInt();
			if(count==0){
				System.out.println(value);
			}else{
				list.add(1);
				
			}
			
			count++;
		}
		

	}

}
