package com;

import java.util.HashSet;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="aabcccccaaa";
		int iterationCounter=0;
		int [] array=new int[100];
		int initChar=a.charAt(0);
		int count=0;
		StringBuilder compressedString=new StringBuilder(100);
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i)==initChar){
				count++;
			}else {
				compressedString.append((char)initChar);
				compressedString.append(count);
				count=0;
				initChar=a.charAt(i);
				System.out.println((char)initChar);
				count++;
			}
			
			if(i==a.length()-1){
				compressedString.append((char)initChar);
				compressedString.append(count);	
				System.out.println((char)initChar);
			}
			iterationCounter++;
		}
		
		/*for (int i = 0; i < a.length(); i++) {
			count++;
			if(i+1 >= a.length() || i+1<a.length() && a.charAt(i)!=a.charAt(i+1)){
				compressedString.append(a.charAt(i));
				compressedString.append(count);
				count=0;
			}
			iterationCounter++;
		}*/
		
		/*compressedString.append((char)initChar);
		compressedString.append(count);*/
		System.out.println(iterationCounter);
		System.out.println(compressedString.toString());
		//First Failed Attempt
		
		/*HashSet<Character> charSet=new HashSet<>();
		int array[]=new int[128];
		for (int i = 0; i < a.length(); i++) {
			array[a.charAt(i)]++;
			if(!charSet.contains(a.charAt(i))){
				charSet.add(a.charAt(i));
			}
		}
		StringBuilder b=new StringBuilder();
		for (char i : charSet) {
			b.append(i+""+array[i]);
		}
		
		System.out.println(b.toString());*/

	}

}
