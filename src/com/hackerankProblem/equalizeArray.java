package com.hackerankProblem;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class equalizeArray {

    static int equalizeArray(int[] arr) {
        // Complete this function
        int freq=0;
        int number=0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
              map.put(arr[i],map.get(arr[i])+1);
            }else{
               map.put(arr[i],1);  
            }
               if(map.get(arr[i])>freq){
                   freq=map.get(arr[i]);
               }
        
    }
        
        return arr.length-freq;
               }
              
               
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        in.close();
    }
}
