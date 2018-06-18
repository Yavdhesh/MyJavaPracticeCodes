package com.hackerankProblem;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

	public static void main(String[] args) {
		StringBuilder s= new StringBuilder();
		// 1. append operation
		// 2. delete last k characters
		// 3. print kth character of s
		// 4. undo 1 and 2 to initial state
		Stack<String> stack=new Stack<>();
		Stack<String> undoStack=new Stack<>();
		Scanner sc=new Scanner(System.in);
		long noOfQueries=sc.nextLong();
		long count=0;
		
		while(count<noOfQueries){
		   long typeOfOperation=sc.nextLong();
			if(1==typeOfOperation){
				System.out.println("Aap jo string jodna chahte hai wo type kare");
				String ap=sc.next();
			s.append(ap);
			stack.push(ap);
			undoStack.push(ap);
				
			}
			if(2== typeOfOperation){
				System.out.println("Aap kitne characters hatana chahte hai");
			int charactersToBeremoved=sc.nextInt();	
			CharSequence temp=s.subSequence(s.length()-charactersToBeremoved, s.length());
			System.out.println(temp);
				
			}
			
			if(3==typeOfOperation){
				
				
			}
			
			if(4 == typeOfOperation){
				
			}
			
			
			count++;
		}
		sc.close();

	}

}
