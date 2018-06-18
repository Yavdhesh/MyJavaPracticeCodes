package com.hackerankProblem;

import java.util.ArrayList;

public class ArrayListOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> a=new ArrayList<>(2);
		for (int i = 0; i < 2; i++) {
			a.add(i,new ArrayList<Integer>());
			boolean b=a.get(i).add(1);
			System.out.println(b);
		}
		
		
		

	}

}
