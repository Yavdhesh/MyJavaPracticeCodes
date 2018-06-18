package com.hackerankProblem;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JesseAndCookiesUsingPriorityQueue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sizeOfList=sc.nextInt();
		//	System.out.println("Minimum sweetness which should be there in each cookie = ");
			PriorityQueue<Long> list=new PriorityQueue<>();
			long sweetness=sc.nextLong();
			long count=0;
			while(count<sizeOfList){
				long value=sc.nextLong();
				list.add(value);
				
				count++;
			}
			
			long localSweetness=list.peek();//(1*(list.poll()))+(2*(list.poll()));
			//System.out.println("size of queue"+list.size());
			int operation=0;
			while(list.size()>1 && localSweetness<sweetness ){
				
				list.add((1*(list.poll()))+(2*(list.poll())));
				localSweetness=list.peek();
				operation++;
			}
			
			if(localSweetness>=sweetness){
				System.out.println(operation);
			}else{
				System.out.println(-1);
			}
		
		
	}

}
