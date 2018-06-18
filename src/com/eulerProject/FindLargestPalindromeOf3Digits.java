package com.eulerProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class FindLargestPalindromeOf3Digits {

	public static boolean  checkIfPalindrome(int input){
	int [] array=new int[100];
	String inputString =String.valueOf(input);
	char[] arr= inputString.toCharArray();
	   boolean flag=true; //String is a palindrome is initial assumption
	if(arr.length%2==0){
		int i=0;
		int j=arr.length-1;
		while(i-j!=1){
		if(arr[i]!=arr[j]){
			flag=false; //flag is true mean not a palindrome
			break;
		}	
		i++;
		j--;
		}
	}else if(arr.length%2!=0){
		int i=0;
		int j=arr.length-1;
		while(i-j!=2){
		if(arr[i]!=arr[j]){
			flag=false; //flag is true mean not a palindrome
			break;
		}	
		i++;
		j--;
		}
	}
	
	
	   
	
	/*for (int i = 0; i < array.length; i++) {
		//System.out.println(array[i]);	
		}*/
	return flag;	
	
	
	}
	
	public static void main(String[] args) {
		
			System.out.println(-3%3);
		// TODO Auto-generated method stub
		System.out.println(checkIfPalindrome(90109));
		int[] array=new int[200];
		int arrayIndex=0;
		checkIfPalindrome(1000000);
		int fix=999;
		int a=0;
		int counter=0;
		ArrayList<Integer> list=new ArrayList<>();
		TreeSet<Integer> noDupList=new TreeSet<>();
		for (int i = 1; i <999; i++) {
			for(int j=1;j < 999; j++){
				counter++;
				if(checkIfPalindrome(j*i)){
					list.add(i*j);
				noDupList.add(j*i);
				}	
			}
			
		}
		Collections.sort(list);
		
		Arrays.sort(array);
		//System.out.println(array[array.length-1]);;
		System.out.println(list.get(list.size()-1));;
		for (Iterator iterator = noDupList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			
		}
		//System.out.println(counter);
//System.out.println(999*91);
//System.out.println(checkIfPalindrome(999*91));
	}

}
