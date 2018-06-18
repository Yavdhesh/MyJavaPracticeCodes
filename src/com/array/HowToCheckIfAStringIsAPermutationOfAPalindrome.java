package com;

import java.util.HashSet;
import java.util.Iterator;

public class HowToCheckIfAStringIsAPermutationOfAPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iterationCount=0;
		String a="aabbcc";
		
		int[] array=new int[123];
		HashSet<Character> charSet=new HashSet<>();
		for (int i = 0; i < a.length(); i++) {
			array[a.charAt(i)]++;
			/*if(!charSet.contains(a.charAt(i))){
			charSet.add(a.charAt(i));
			}*/
		}
		
		int count=0;
		/*for (int i = 0; i < charSet.size(); i++) {
			if(array[]%2==1){
				count++;
				if(count>1){
					break;
				}
			}
			iterationCount++;
		}
		*/
		
		for (int i = 'a'; i < 'z'; i++) {
			if(array[i]%2==1){
				count++;
				if(count>1){
					break;
				}
				
			}
			iterationCount++;
		}
		
		System.out.println("It took me these many iterations"+iterationCount);
		if(count>1){
			System.out.println("Not a palindrome");
		}else{
			System.out.println("Is a permutation of palindrome");
		}

	}

}
