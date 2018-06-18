package com.hackerankProblem;

import java.util.Scanner;

public class DesignerPDFViewer {

	 static int designerPdfViewer(int[] h, String word) {
	    int value=word.length();
	    int maxHeight=0;
	    for (int i = 0; i < word.length(); i++) {
	    	int local=word.charAt(i)-97;
			if(h[local]>=maxHeight){
			maxHeight=h[local];	
			}
		}
		 
		 return value*maxHeight;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int[] h = new int[26];
	        for(int h_i = 0; h_i < 26; h_i++){
	            h[h_i] = in.nextInt();
	        }
	        String word = in.next();
	        int result = designerPdfViewer(h, word);
	        System.out.println(result);
	        in.close();
	    }
}
