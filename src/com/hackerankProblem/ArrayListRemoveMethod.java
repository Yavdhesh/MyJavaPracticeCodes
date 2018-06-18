package com.hackerankProblem;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListRemoveMethod {
	
	public static void minheapify(ArrayList<Long> list, int rootIndex){
		int leftChild=(2*rootIndex)+1;
		int rightChild= (2*rootIndex)+2;
		int smaller=rootIndex;
		
		if(leftChild<list.size() && list.get(leftChild)<=list.get(rootIndex)){
			smaller=leftChild;
		}
		
		if(rightChild< list.size() && list.get(smaller)>=list.get(rightChild)){
			smaller=rightChild;
		}
		
		if(rootIndex!=smaller){
			Collections.swap(list, rootIndex, smaller);
			minheapify(list, smaller);
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Long> a=new ArrayList<>();
//		for (int i = 0; i < 6; i++) {
//			a.add(i);
//			System.out.println(i);
//		}
		a.add(1l);
		a.add(2l);
		a.add(3l);
		a.add(10l);
		a.add(9l);
		a.add(12l);
		
		for (int i =a.size()/2; i>=0; i--) {
			minheapify(a, i);
		}
		
		a.remove(0);
		a.remove(0);
		a.add(5l);
		for (int i =a.size()/2; i>=0; i--) {
			minheapify(a, i);
		}
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		/*for (int i = 0; i < a.size(); i++) {
			//System.out.println(a.get(i));
		}
		System.out.println("after first removal");
		a.remove(0);
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("after second removal");
		a.remove(1);
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}*/

	}

}
