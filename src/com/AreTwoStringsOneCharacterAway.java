package com;

import java.util.HashMap;

public class AreTwoStringsOneCharacterAway {
	
	public static int getCharIndex(char input){
		return input-97;
	}
	
	public static boolean AreTheyOneEditAwayOrNot(String first, String second){
		
		if(first.length()-second.length()>1){
			System.out.println("More than one edit");
			return false;
		}
		
		int i=0;
		int j=0,count=0;
		while(i<first.length() && j<second.length()){
			if(first.charAt(i)==second.charAt(j)){
				i++;j++;
			}
			else{
				count++;
				if(first.length()>second.length()){
					i++;
				}else if(first.length() < second.length()){
					j++;
				}else if(first.length() == second.length()){
					i++;j++;
				}
			}
			if(count>1){
				break;
			}
		}
		
		if(first.length() >second.length() || second.length() > first.length()){
			if(count>1){
				System.out.println("More than one edit away");	
			}
			if(count==0){
				System.out.println("One edit away");
			}
			
			if(count==1){
				System.out.println("One edit away");	
			}
		}else if(first.length() == second.length()){
		if(count>1){
			System.out.println("More than one edit away");
		}else if(count==1){
			System.out.println("One edit away");
		}else{
			System.out.println("No edit required");
		}
		}
		return count<1;
	}

	public static void main(String[] args) {
		
		String first="balerina";
		String second="cale";
		
		System.out.println(AreTheyOneEditAwayOrNot(first,second));
		
		int [] array=new int[30];
		boolean morethanoneeditaway=false;
		if(first.length()-second.length()>1){
			morethanoneeditaway=true;
		}
		for (int i = 0; i < first.length(); i++) {
			array[getCharIndex(first.charAt(i))]++;
		}
		
		boolean flag=true;
		int count=0;
		for (int i = 0; i < second.length(); i++) {
			array[getCharIndex(second.charAt(i))]--;
			if(array[getCharIndex(second.charAt(i))]<-1){
				flag=false;
			}
			
			if(array[getCharIndex(second.charAt(i))]==-1){
				count++;
			}
			
		}
		if(flag==false || count > 1 || morethanoneeditaway){
			System.out.println("More than one edit away");
		}else{
			System.out.println("one edit away or zero edit away");
		}
		

	}

}
