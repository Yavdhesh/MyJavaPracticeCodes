package com;

import java.util.Scanner;
import java.util.Stack;

public class MaxElementInaStackHackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> elementStack=new Stack<>();
		Stack<Integer> maxElementInStack=new Stack<>();
		
		Scanner sc=new Scanner(System.in);
		int queries=sc.nextInt();
		
		int count=0;
		
		while(count < queries){
		int queryType=sc.nextInt();
			if(1==queryType){
				int nextElement=sc.nextInt();
				if(elementStack.isEmpty()){
					elementStack.push(nextElement);
					maxElementInStack.push(nextElement);
				}else{
					int max=maxElementInStack.peek();
					if(max < nextElement){
						//maxElementInStack.pop();
						maxElementInStack.push(nextElement);
						elementStack.push(nextElement);
					}else{
						maxElementInStack.push(max);
						elementStack.push(nextElement);
					}
					}
				}
				
			else if(2==queryType){
				
				if(elementStack.isEmpty()){
					
				}else{
					/*int max=maxElementInStack.peek();*/
					maxElementInStack.pop();
					elementStack.pop();
					
					
				
			}
			}else if(3==queryType){
				
			System.out.println(maxElementInStack.peek());
			
			}
			}
			
		}

	}


