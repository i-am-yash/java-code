package leetcode;

import java.util.*;



public class SlidingWindowMaximum {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		int k=sc.nextInt();
		Deque<Integer>dq=new LinkedList<Integer>();
		int ans[]=new int[n-k+1];
		int index=0;
		for(int r=0;r<k;r++) {
				while( !dq.isEmpty() && a[dq.peekLast()]<a[r]) {
					dq.pollLast();
				}
			dq.addLast(r);
			
		}
		ans[index++]=a[dq.peekFirst()];

		int r=k;
		int l=1;
		while(r<a.length) {
			if(dq.peekFirst()<l)dq.pollFirst();
				while(!dq.isEmpty() && a[dq.peekLast()]<a[r]) {
					dq.pollLast();
				}
				
			
			dq.addLast(r);
			ans[index++]=a[dq.peekFirst()];
			l++;
			r++;
		}
		System.out.println(Arrays.toString(ans));
		

	}
	


	
	
}
