package com.Edx.Microsoft;

public class MergeSort {
	
	
	public static int[] sortArray(int [] a){
		
	int[] k=sort(a);
	return k;
	}
	
	public static int[] sort(int[] a){
		int leftSize=0;
		int rightSize=0;
		int [] left=null;
		int [] right=null;
		if(a.length<2){
			return a;
		}
		int j=0;
		int k=0;
		if(0==(a.length%2)){
			left=new int[a.length/2];
			right=new int[a.length/2];
			
			
					
		}else{
			left=new int[a.length/2];
			right=new int[(a.length/2)+1];
			
		}
		for (int i = 0; i < a.length; i++) {
			if(i<(a.length/2)){
				left[j++]=a[i];
				//System.out.println(a[i]);
			}else{
				right[k++]=a[i];
				//System.out.println(a[i]);
			}
		}
		
		left=sort(left);
		right=sort(right);
		
		return merge(left, right);
	}
	
	public static int[] merge(int[] left, int[] right){
		
		int[] array=new int[left.length+right.length];
		int index=0;
		int i=0,j=0;
		/*if(left.length==2){
			if(left[0]>left[1]){
				int tmp=left[0];
				left[0]=left[1];
				left[1]=tmp;
			}
		}
		if(right.length==2){
			if(right[0]>right[1]){
				int tmp=right[0];
				right[0]=right[1];
				right[1]=tmp;
			}	
		}*/
		while(i<left.length && j<right.length){
			if(left[i]<=right[j]){
				array[index++]=left[i++];
				
			}else{
				array[index++]=right[j++];
				
				
			}
			
			
		}
		while(j<right.length){
			array[index++]=right[j++];
		}
		while(i<left.length){
			array[index++]=left[i++];
		}
		/*for (int a = 0; a < array.length; a++) {
			System.out.println(array[a]);
		}
		System.out.println("new");
		*/
		return array;
	}
	
	public static int gcd(int a, int b){
		
		if(b==0){
			return a;
		}
		return gcd(b,a%b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a=new int[] {7,34,9,1,5,4,6,8,9,23,25,57,99};
		int []k=sortArray(a);
		for (int i = 0; i < k.length; i++) {
			System.out.println(k[i]);
		}
		
		System.out.println(gcd(2, 3));
		
	}

}
