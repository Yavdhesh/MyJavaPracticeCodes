package com;

public class ComparisonBetweenTwoIntegerWithoutIfElseAndComparison {
	
	public static int k(int a, int b){
		int k;
		return k=(a-b)<0?0:1;
	}

	public static int b(int l){
	//	l=l%Integer.MAX_VALUE;
		return 1^((l >> 63) & 0x1  );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=122;
		int b=20;
		int k;
		k=a*b(a-b)+b*b(b-a);
		
		
		System.out.println("which one is greater"+k );
		

	}

}
