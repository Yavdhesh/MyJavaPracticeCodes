package com.hackerankProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		long noOfQueries=sc.nextLong();
		ArrayList<ArrayList<Integer>> list=new ArrayList<>(size);
for (int i = 0; i < size; i++) {
	list.add(i,new ArrayList<Integer>());
}		
		long count=0;
		int lastAnswer=0;
		while(count<noOfQueries){
			int queryType=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(1==queryType){
			x=(x^lastAnswer)%size;
			list.get(x).add((y));
			
			}
			if(2==queryType){
				x=(x^lastAnswer)%size;
				int value=list.get(x).get((y%(list.get(x).size()))); //first time I made a mistake here by earlier
				                                                     // it was y%list.get(x).size() , thus it threw me indexoutofbound
				lastAnswer=value;
				System.out.println(lastAnswer);
			}
			
			count++;
		}
		

	}

}
