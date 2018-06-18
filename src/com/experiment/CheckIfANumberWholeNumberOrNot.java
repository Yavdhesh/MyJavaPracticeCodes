package com.experiment;

public class CheckIfANumberWholeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a =1800000;
		float b = 6;
		
		if((a/b)%1==0.00f){
			System.out.println("whole");
		}else{
			System.out.println("no whole");
		}
		
		if((a/b) == (int)(a/b)){
			System.out.println("yes");
		}
		

	}

}
