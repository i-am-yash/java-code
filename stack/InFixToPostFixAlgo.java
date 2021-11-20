package stack;

import java.util.Stack;

public class InFixToPostFixAlgo {

	public static void main(String[] args) {
		String prefix="*-A/BC-/AKL";
		int n=prefix.length();
		Stack<String> st= new Stack<>();
		for(int i=n-1;i>=0;i--) {
			if(isOperator(prefix.charAt(i))) {
				String op1=st.pop();
				String op2=st.pop();
				String temp=op1+op2+prefix.charAt(i);
				st.push(temp);
				
			}
			else {
				st.push(prefix.charAt(i)+"");
			}
		}
		System.out.println(st.peek());
		
		

	}
	static boolean isOperator(char s) {
		if(s=='+' || s=='-'|| s=='*'||s=='/') {
			return true;
		}
		return false;
	}

}
