package com;

import java.util.HashSet;

public class FindIfAStringHasRepeatedCharacters {

	public static void main(String[] args) {

       boolean notUnique=false;
		String a="abcde";
		HashSet<Character> charSet=new HashSet<>();
		for(int i=0; i<a.length();i++){
		if(!charSet.contains(a.charAt(i))){
			charSet.add(a.charAt(i));
			
		}else{
			notUnique=true;
			break;
		}
			
		}
		System.out.println(notUnique);

	}

}
