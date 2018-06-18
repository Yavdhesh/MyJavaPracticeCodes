package com.hackerankProblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class IsBalancedString_Stack {

	static String isBalanced(String s) {
		String balanced="NO";
		HashMap<Character, Character> charMap=new HashMap<>();
		charMap.put(')', '(');
		charMap.put('}', '{');
		charMap.put(']', '[');
		HashSet<Character> OpenBrackSet=new HashSet<>();
		OpenBrackSet.add('(');
		OpenBrackSet.add('{');
		OpenBrackSet.add('[');
		Stack<Character> stack=new Stack<>();
		   char [] array=s.toCharArray();
		   if(!charMap.containsKey(array[0])){
		for (int i = 0; i < array.length; i++) {
		if(OpenBrackSet.contains(array[i])){
			/*System.out.println(array[i]);*/
			//System.out.println("Inside"+array[i]);
			stack.push(array[i]);
		}
		if(charMap.containsKey(array[i])){
			/*System.out.println(stack.pop());;*/
			if(!stack.isEmpty()){
			//	System.out.println("Somehow I got inside");
			if( stack.peek()==charMap.get(array[i])){
			stack.pop();}}
			
		}
		}
		
		
		if(stack.isEmpty()){
			balanced="YES";
		//	System.out.println("NO");
		}else{
			balanced="NO";
		//	System.out.println("YES");
		}
		
		   }
		
		
		return balanced;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }

}
