package leetcode;

import java.util.*;

public class LongestValidParanthesis {

	static Stack<Character>st;
	static Stack<Integer>index;

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		st= new Stack<Character>();
		index= new Stack<Integer>();
		System.out.println(solve(s));


	}
	static int solve(String s) {
		int n=s.length(); 			//applorach
										//	we push those index whose closing bracket may not be available thats we pop it if its closing braces is avaukable
		int ct=0;
		int max=0;
		index.push(-1); //initialize
		for(int i=0;i<n;i++) {
			char ch=s.charAt(i);
			if(ch=='(') {
				st.push(ch);
				index.push(i);
			}else {
				if(st.isEmpty()) {
					index.push(i);
				}else {
					st.pop();
					index.pop();
					ct=i-index.peek();   //it counts the valid paranthsis/.
				}
				
				
			}
			max=Math.max(max, ct);
//			System.out.println(i+" "+max);
		}
		return max;
	}

	
	

	
	
}
