package com.array;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;

public class IfOneElementInARowIsZeroEntireRowIsZero {
	
	class MatrixDTO{
		private int rowIndex=0;
		private int colIndex=0;
		public int getRowIndex() {
			return rowIndex;
		}
		public void setRowIndex(int rowIndex) {
			this.rowIndex = rowIndex;
		}
		public int getColIndex() {
			return colIndex;
		}
		public void setColIndex(int colIndex) {
			this.colIndex = colIndex;
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      IfOneElementInARowIsZeroEntireRowIsZero a=new IfOneElementInARowIsZeroEntireRowIsZero();
		int [][] matrix=new int[][]{{1,2,3,4},{0,5,6,0},{7,8,9,10},{11,0,12,13}};
		HashMap<Integer, Integer> q=new HashMap<>();
		HashSet<Integer> column=new HashSet<>();
		HashSet<Integer> row=new HashSet<>();
		for (int i = 0; i <matrix.length; i++) {
			int in=0;
			for (int j = 0; j <matrix.length; j++) {
				System.out.print(matrix[i][j]+" ");
				if(matrix[i][j]==0){
				row.add(i);
				column.add(j);
				}
				
				
			}
			System.out.println();
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(row.contains(i)){
					matrix[i][j]=0;
				}
				if(column.contains(j)){
					matrix[i][j]=0;
				}
			}
		}
		
		
		for (int i = 0; i <matrix.length; i++) {
			int in=0;
			for (int j = 0; j <matrix.length; j++) {
				System.out.print(matrix[i][j]+" ");
				if(matrix[i][j]==0){
				row.add(i);
				column.add(j);
				}
				
				
				
			}
			System.out.println();
		}
		
		System.out.println(q);
		
		for (Iterator iterator = row.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		for (Iterator iterator = column.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
	
	

}
