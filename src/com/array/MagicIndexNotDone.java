package com.array;

public class MagicIndex {
	
	public static int magicIndex(int [] array){
		int begin=0;
		int mid=(array.length)/2;
		int end=array.length-1;
       	int i=magixIndexFinder(array, begin, mid, end)	;
		
		return i;
	}
	
	private static int magixIndexFinder(int [] array,int begin, int mid, int end){
		int i=0;
	
		if(array[mid]==mid){
			return mid;
		}else if(array[mid]<mid){
			i=magixIndexFinder(array, mid,(end-mid)/2, end);
		}else if(array[mid]>mid){
			i=magixIndexFinder(array, 0,mid/2, mid);
		}	
		
		return 0;
	}

	public static void main(String[] args) {
		
		
		int array[]=new int[]{-1,0,2,4,5,6,7}; //disticnt elements
		
		System.out.println(magicIndex(array));
	}

}
