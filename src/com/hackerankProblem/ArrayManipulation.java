package com.hackerankProblem;

import java.util.Scanner;

public class ArrayManipulation {
	
	public static void heapify(long [] array,int rootIndex){
	int leftBaccha=2*rootIndex+1;	
	int rightBaccha=2*rootIndex+2;
	int larger=rootIndex;
	
	if(leftBaccha<array.length && array[leftBaccha]>array[rootIndex]){
		larger=leftBaccha;
	}
	
	if(rightBaccha<array.length && array[rightBaccha]>array[larger]){
		larger=rightBaccha;
	}
	
	if(rootIndex!=larger){
		long temp=array[rootIndex];
		array[rootIndex]=array[larger];
		array[larger]=temp;
		heapify(array, larger);
	}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter size of the array");
		int sizeOfArray=sc.nextInt();
		long[] array=new long[sizeOfArray+1];
		//System.out.println("Enter number of Update Operations to be done");
		long numberOfOperation=sc.nextInt();
		long count=0;
		long max=0;
		while(count<numberOfOperation){
		//	System.out.println("Enter begin index");
			int beginIndex=sc.nextInt();
		//	System.out.println("enter end index");
			int endIndex=sc.nextInt();
		//	System.out.println("Enter value to be replaced");
			long valueReplacement=sc.nextLong();
			for (int i = beginIndex; i<= endIndex; i++) {
				array[i]=array[i]+valueReplacement;
				if(max<=array[i]){
					max=array[i];
				}
			}
			count++;
		}
		
		System.out.println(max);
		
		/*for (int i = array.length/2; i >=0; i--) {
			heapify(array, i);
		}*/
        
		System.out.println(array[0]);
		/*for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}*/
	}

}
