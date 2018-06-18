package com.experiment;

import java.util.ArrayList;

public class ArrayListAsStack {

	public static void main(String[] args) {
		
		ArrayList<Integer> v=new ArrayList<>();
		v.add(3);
		v.add(5);
		v.add(7);
		v.add(9);
		v.add(3);
		v.add(4);
		
		while(!v.isEmpty()){
			System.out.println(v.get(0));
			v.remove(0);
		}

	}

}
