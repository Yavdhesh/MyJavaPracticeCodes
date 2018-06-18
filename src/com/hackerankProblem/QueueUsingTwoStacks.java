package com.hackerankProblem;

import java.nio.file.FileVisitResult;
import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long queries=sc.nextLong();
		Stack<Long> first=new Stack<>();
		Stack<Long> second=new Stack<>();
		
		long count=0;
		while(count<queries){
			long type=sc.nextLong();
			if(1==type){
				long value=sc.nextLong();
				first.push(value);
			}
			if(2== type){
				if(!first.isEmpty() && second.isEmpty()){
					while(!first.isEmpty()){
						second.push(first.pop());
					}
				}
			}
			if(3 == type){
				if(!first.isEmpty() && second.isEmpty()){
					while(!first.isEmpty()){
						second.push(first.pop());
					}
				}
				
			}
			
			
		}
		

	}

}
