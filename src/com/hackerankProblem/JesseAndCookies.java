package com.hackerankProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JesseAndCookies {
	
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
//min heap
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	//	System.out.println("Aarambh me size list ki = ");
		int sizeOfList=sc.nextInt();
	//	System.out.println("Minimum sweetness which should be there in each cookie = ");
		ArrayList<Long> list=new ArrayList<>();
		long sweetness=sc.nextLong();
		long count=0;
		while(count<sizeOfList){
			long value=sc.nextLong();
			list.add(value);
			
			count++;
		}
		
		Collections.sort(list);
		/*for (int i = 0; i <list.size(); i++) {
				System.out.println(list.get(i));
			}*/
		boolean flag_not_possibel=false;	
		long min=list.get(0);
		long localSweetness=(list.get(0)*1)+(list.get(1)*2);
		long operation=0;
		while(localSweetness<sweetness){
			//System.out.println("Inside swwetness");
			
		//	System.out.println(localSweetness);
			
				list.remove(0);
				list.remove(0);
			//	System.out.println(list.size());
				list.add(localSweetness);
			//	System.out.println(list.size());
			    if(list.size()>2){
				localSweetness=(list.get(0)*1)+(list.get(1)*2);}
			    else{
			    	flag_not_possibel=true;
			    	break;}
			operation++;
		}
		
		/*for (int i = 0; i <list.size(); i++) {
		//	System.out.println(list.get(i));
		}*/
		if(flag_not_possibel){
			System.out.println(-1);
		}else{
		System.out.println(operation+1);
		}
	}

}
