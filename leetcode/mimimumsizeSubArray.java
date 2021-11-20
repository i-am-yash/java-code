package leetcode;

import java.util.*;



public class mimimumsizeSubArray {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		int target=sc.nextInt();
		//int k=sc.nextInt();
		
		System.out.println(solve(a,target));
		

	}
	static int solve(int a[],int target) {
		int min=Integer.MAX_VALUE;
		long sum=0;
		int l=0;
		int r=0;
		while(r<a.length && l<a.length) {
			sum+=a[r];
			
			if(sum<target) {
				
				r++;
			}else {
				min=Math.min(min,r-l+1);
				System.out.println(l+" "+r+" "+min+" "+sum);
				sum-=a[l];
				sum-=a[r];
				l++;
			}
		}
		if(min>=Integer.MAX_VALUE)return min=0;
		return min;
		
	}
	


	
	
}
