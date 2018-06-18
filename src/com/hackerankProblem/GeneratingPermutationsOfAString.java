package com.hackerankProblem;

import java.util.HashSet;

public class GeneratingPermutationsOfAString {
	
	public static boolean checkIfPalindrome(String input){
		
		int iterationCount=0;
		String a=input;
		
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
		
		//System.out.println("It took me these many iterations"+iterationCount);
		boolean isPalindrome=false;
		if(count>1){
			//System.out.println("Not a palindrome");
		}else{
			isPalindrome=true;
			//System.out.println("Is a permutation of palindrome");
		}

		return isPalindrome;
	}
	
	public static void permGenerator(String string){
		
		permutation("",string);
	}
	
	private static void permutation(String pref, String s) {
		int l=s.length();
		if(l==0){
			if(checkIfPalindrome(pref)){
			System.out.println(pref);}
		}
		else{
			for (int i = 0; i < s.length(); i++) {
			//	it accidently generates the permutations of all the substring
				permutation(pref+s.charAt(i),/* s.substring(0, i)+*/s.substring(i+1,s.length()));
				//permutation(s.charAt(i)+"",s.substring(0, i)+s.substring(i+1,s.length()));
				//permutation(s.charAt(i)+pref, s.substring(i+1,l));
				
			//	permutation(pref+s.charAt(i), s.substring(0, i)+s.substring(i+1,s.length()));
			}
		}
	}
	
	private static void combination(String s){
		
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String a="abcd";
		//System.out.println("nothiing"+a.substring(0, ));
		
		
	permGenerator("aba");
	}

}
