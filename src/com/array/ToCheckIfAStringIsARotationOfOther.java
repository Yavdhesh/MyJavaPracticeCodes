package com.array;

public class ToCheckIfAStringIsARotationOfOther {
	
	public static boolean isSubstring(String one, String two){
		if(one.length()!=two.length() || one.length()==0 || two.length()==0)
		   return false;
		 one=one+one;
		 return one.contains(two);
		
	}
	
	public static boolean isRotated(String a, String b){
		char[] ar1=a.toCharArray();
		char[] ar2=b.toCharArray();
		int rotation=0;
		
		int count=0;
		
		/*while(count<ar1.length){
			char temp=ar2[ar2.length-1];
			for (int i = 0; i < ar2.length; i++) {
				if(i+1<ar2.length){
					ar2[i+1]=
				}
			}
		}*/
		return false;
	}
	
	public static boolean firstChar(){
	
		/*if(a[0]==b[0]){
			return true;
		}*/
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a="waterbottle";
		String b="erbottlewat";
		char array[]=b.toCharArray();
		
		System.out.println(isSubstring(a,b));
		int rotateByOne=0;
		while(rotateByOne<array.length){
		int rotation=1%a.length();
		char[] tempArray=new char[rotation];
		int count=0;
		for (int i = array.length-rotation; i < array.length; i++) {
		tempArray[count++]=array[i];
			
		}
		
		
		for (int i = array.length-1-rotation; i >=0; i--) {
			array[i+rotation]=array[i];
			
		}
		
		for (int i = 0; i < tempArray.length; i++) {
			array[i]=tempArray[i];
		}
		
		
		if(String.valueOf(array).equals(a)){
			System.out.println("is a substring");
			System.out.println(rotateByOne);
			break;
		}
		rotateByOne++;
		}
		/*for (int i = 0; i < tempArray.length; i++) {
			System.out.println(tempArray[i]);
		}*/        
		
		
	}

}
