package com.array;

public class URILIFYASTRING {

	public static void main(String[] args) {
		
		String str="Mr John Smith         ";
		String a="%20";
		StringBuilder strb=new StringBuilder();
		//System.out.println((int)' ');
		char[] array=str.toCharArray();
		//below solution does not edit the existing string
		/*for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)==32){
			strb.append(a);
			
		}else{
			strb.append(str.charAt(i));
		}
			
		}*/
		
		// finding count of white spaces and index of each white
		boolean flag=false;
		int countSpace=0;
		for (int i = array.length-1; i >=0; i--) {
			if(array[i]!=32){
				flag=true;
			}
			if(flag==true){
				if(array[i]==32){
					
					countSpace++;
				}
			}
			
		}
		System.out.println(countSpace);
		char o='%';
		char n='2';
		char e='0';
		int factor=2;
		for (int i = array.length-1; i >=0; i--) {
		
			if (array[i]!=32) {
				array[i+2]=array[i];
			}else{
				array[i+2]=o;
				array[i+1]=n;
				array[i+2]=e;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//System.out.println(strb.toString());

	}

}
