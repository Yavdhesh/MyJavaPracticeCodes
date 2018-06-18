package com;

import java.util.Scanner;
import java.util.Stack;

public class MinElementInStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> elementStack=new Stack<>();
		Stack<Integer> minElementStack=new  Stack<>();
		Scanner in=new Scanner(System.in);
		
		int sizeOfStack=in.nextInt();
		int count=0;
		System.out.println("Enter values in stack");
		while(count < sizeOfStack){
		int nextElement=in.nextInt();
		if(elementStack.isEmpty()){
			elementStack.push(nextElement);
			minElementStack.push(nextElement);
		}else{
			int min=minElementStack.peek();
			if(min >nextElement){
				minElementStack.pop();
				minElementStack.push(nextElement);
				elementStack.push(nextElement);
			}
		}
			
			count++;
		}
		
	System.out.println(minElementStack.peek());
	}

}
