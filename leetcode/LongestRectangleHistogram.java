package leetcode;

import java.util.*;



public class LongestRectangleHistogram {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);


	}
	static int solve(int a[]) {
		Stack<int []>st=new Stack<int[]>();
		int max=0;
		int strt=0;
		for(int i=0;i<a.length;i++) {
			strt=i;
			while(!st.isEmpty() && st.peek()[1]>a[i]) {
				int index=st.peek()[0];
				int height=st.peek()[1];
				st.pop();
				max=Math.max(max, (i-index)*height );
				strt=index;
				
			}
			int temp[]=new int[2];
			temp[0]=strt;
			temp[1]=a[i];
			st.push(temp);
		}
		while(!st.isEmpty()) {
			max=Math.max(max,(a.length-st.peek()[0])*st.peek()[1]);
			st.pop();
		}
		
		return  max;
		
	}



	
	
}
