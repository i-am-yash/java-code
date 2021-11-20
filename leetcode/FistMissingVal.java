package leetcode;

import java.util.*;


public class FistMissingVal {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]= {1,2,0};
		System.out.println(solve(a));
		System.out.println(Arrays.toString(a));
		
		
		

	}
	static int solve(int a[]) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			if(a[i]<0)a[i]=0;
			
		}
		for(int i=0;i<n;i++) {
			int val=Math.abs(a[i]);
			if(1<=val && val<=n) {
				
			
			if(a[val-1]>0)
			a[val-1]*=-1;
			else if(a[val-1]==0) {
				a[val-1]=-1*(n+1);
			}
			}
			
		}
		for(int i=1;i<n+1;i++) {
			if(a[i-1]>=0)return i;
		}
		return n+1;
		
	
	}

	
	


	
	

	
	
}
