package stack;

import java.util.Stack;

public class getMinimum {

	public static void main(String[] args) {
		int a[]= {2,5,4,1,-6,7,8};
		int n=a.length;
		Stack<Integer> min= new Stack<>();
		int mn=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]<=mn) {
				mn=a[i];
				min.push(mn);
			}
			
		}
		System.out.println(mn);
		System.out.println(min.peek());
		
		

	}

}
