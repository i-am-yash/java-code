package CodeForces;

import java.util.Scanner;
import java.util.Stack;

public class Adjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc= new Scanner(System.in);
			int t=sc.nextInt();
			while(t-->0) {
				Stack<Character> stack = new Stack<>();
			//	String s="110011";
				sc.nextLine();
				String s=sc.nextLine();
				for(int i=0;i<s.length();i++) {
					if(stack.isEmpty()) {
						stack.push(s.charAt(i));
						
					}
					else {
						if(s.charAt(i)==stack.peek()) {
							stack.push(s.charAt(i));
						}
						else {
							stack.pop();
						}
						
						
					}
				
				}
				System.out.println(stack.size());
				
			}
			
			
			
			
			
		}catch(Exception e) {
			
		}

	}

}
