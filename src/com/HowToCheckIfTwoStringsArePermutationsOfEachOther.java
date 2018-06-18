package com;

import java.util.HashMap;
import java.util.Iterator;

public class HowToCheckIfTwoStringsArePermutationsOfEachOther {
	static int iterationCounter=0;
	
	public static boolean checkIfTwoStringsArePermutations(String first, String second){
		
		if(first.length()!=second.length()){
			return false;
		}
		 HashMap<Character, Integer> checkCount= new HashMap<>();
		 for (int i = 0; (i%Integer.MAX_VALUE)< (first.length()%Integer.MAX_VALUE); i++) {  
				if(!checkCount.containsKey(first.charAt(i))){
					checkCount.put(first.charAt(i),1);
				}else {
					checkCount.put(first.charAt(i), checkCount.get(first.charAt(i))+1);
				}
				
				iterationCounter++;
			}
		 
		 for (int i = 0; (i%Integer.MAX_VALUE)< (second.length()%Integer.MAX_VALUE); i++) {
				if(!checkCount.containsKey(second.charAt(i))){
					return false;
				}else{
					checkCount.put(second.charAt(i),checkCount.get(second.charAt(i))-1);
				}
				iterationCounter++;
			}
			 
			 for (Iterator<Integer> iterator = checkCount.values().iterator(); iterator.hasNext();) {
				Integer type = (Integer) iterator.next();
				
				if(type!=0){
					return false;
				}
				 iterationCounter++;
			}
			
		 
		 System.out.println(checkCount);
		
		return true;
	}
	public static void main(String[] args) {
    String first="aabcbbdfefedkollmmlmlmvcbvcb";
    String second ="ababcbdefedfokllllmmmmvvccbb";
    
   // System.out.println(checkIfTwoStringsArePermutations(first,second));
    
    int[] array=new int[128];
    for (int i = 0; i < first.length(); i++) {
		array[first.charAt(i)]++;
		iterationCounter++;
	}
  
    boolean flag=true;
    for (int i = 0; i < second.length(); i++) { //smart soltions
		array[second.charAt(i)]--;
		if(array[second.charAt(i)]<0){
			flag=false;
			break;
		}
		iterationCounter++;
	}
   System.out.println(flag);
    System.out.println(iterationCounter);
   
		
		

	}

}
