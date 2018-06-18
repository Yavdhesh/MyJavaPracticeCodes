package com.eulerProject;

import java.util.ArrayList;

public class SumOfEvenFibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//long array[] = new long[];
		ArrayList<Long> array=new ArrayList<>();
		array.add(1l);
		array.add(2l);
		int i=0;
		int j=i+1;
		long sum=2l;
		long value=array.get(i)+array.get(j);
		while(4000000l  >= value){
			if(0 == value%2){
				sum=sum+value;
			}
			// System.out.println(value);
			array.add(value);
			
			i=i+1;
			j=j+1;
			value=array.get(i)+array.get(j);
			//System.out.println(value);
			
		}
		System.out.println(array.size());
		System.out.println(sum);
		for (int j2 = 0; j2 < array.size(); j2++) {
	//	System.out.println(array.get(j2));	
		}
		/*for (int i = 0; i < Integer.MAX_VALUE; i++) {
			if( i+1  < Integer.MAX_VALUE && 4000000 >= array.get(i)+array.get(i+1)){
				
			}
		}
*/
	}

}
