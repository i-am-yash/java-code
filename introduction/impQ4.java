package introduction;

import java.util.Scanner;
import java.util.Stack;

public class impQ4 {
// is parantheisis balance
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ente string");
		String input=sc.nextLine();
		sc.close();
		Stack<Character>stack = new Stack<>();
		boolean isBalance= true;
		
		
		
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			
			if(ch=='(' || ch=='{' || ch=='[') {
				stack.push(ch);
				continue;
				}
			
			if(stack.isEmpty()) {
				isBalance=false;
				break;
			}
			if(ch==')') {
				if(stack.peek()=='(') {
					stack.pop();
					isBalance=true;
				}}
				
				if(ch=='}') {
					if(stack.peek()=='{') {
						stack.pop();
						isBalance=true;
					}}
					
					if(ch==']') {
						if(stack.peek()=='[') {
							stack.pop();
							isBalance=true;}
						}
					if(!stack.isEmpty()) {
						isBalance=false;
					}
				
		
			}
		if(isBalance) {
			System.out.println("balance");
		}else
		{
			System.out.println("not balance");
		}
			
			
			
		
		
	

	}

}
