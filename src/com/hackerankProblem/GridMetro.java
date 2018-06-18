package com.hackerankProblem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GridMetro {

	
	    // Complete the gridlandMetro function below.
	    static int gridlandMetro(int n, int m, int k, int[][] track) {
	    	/*boolean [] array=new boolean[n*m]; 
	    	int ind=0;
	    	for (int i = 0; i < track.length; i++) {
	    		for (int j = 0; j < track.length; j++) {
					System.out.println(track[i][j]);
					
				}
				
			}*/
	    	Long l=0l;
	    	
	    	//Long l=0;
	    	Long N=(long) n;
	    	Long M=(long) m;
	    	
	    	for (int i = 0; i < k%Integer.MAX_VALUE ; i++) {
	    		long temp=(track[i][2]-track[i][1]);
	    		l=l+temp+1;
				/*l=((l%Integer.MAX_VALUE)+(+1)%Integer.MAX_VALUE;*/
				System.out.println(l);
			}
	    	Long re=N*M-l;
	    	return re.intValue();
		


	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	       

	        String[] nmk = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nmk[0]);

	        int m = Integer.parseInt(nmk[1]);

	        int k = Integer.parseInt(nmk[2]);

	        int[][] track = new int[k][3];

	        for (int i = 0; i < k; i++) {
	            String[] trackRowItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int j = 0; j < 3; j++) {
	                int trackItem = Integer.parseInt(trackRowItems[j]);
	                track[i][j] = trackItem;
	            }
	        }

	        int result = gridlandMetro(n, m, k, track);
	        System.out.println(result);

	       
	    


	}

}
