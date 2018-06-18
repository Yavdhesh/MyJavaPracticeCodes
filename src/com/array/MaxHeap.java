package com.array;

public class MaxHeap {

	//Given an integer array, convert it to max heap array,
	//it would be a tool to find max and min elements easily 
	
	public static void heapify(int [] array,int rootIndex){
	
		int leftChild=(2*rootIndex)+1;
		int rightChild=(2*rootIndex)+2;
		int largest=rootIndex;
		
		
		if(leftChild<array.length && array[leftChild]>=array[rootIndex]){
			largest=leftChild;
		}
		if(rightChild<array.length && array[largest]<=array[rightChild]){
			largest=rightChild;
		}
		
		
		
		if(largest!=rootIndex){
			int temp=array[rootIndex];
			array[rootIndex]=array[largest];
			array[largest]=temp;
			heapify(array, largest);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] ={1,5,6,3,9,10,23,2,2};
		
		//(2i+1) and (2i+2) are two child elements of a parent at i
		
		
		
		for (int i =3; i >= 0; i--) {
			heapify(array,i);	
		}
			
		//heapify(array,1);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
