package com.array;

public class MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat=new int[4][4];
		int k=1;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j]=k++;
			}
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = mat.length-1; j >=0 ; j--) {
				int temp=mat[i][j];
				mat[i][j]=mat[j][mat.length-1-(i)];
				mat[j][mat.length-1-(i)]=temp;
			}
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
			System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	

}
