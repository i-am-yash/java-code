package leetcode;

import java.util.*;





public class FindMinimumInSortedArray2 {
static List<Integer>ans;
static HashMap<String,Integer>dp;
static int max;
static boolean flag;

	
	public static void main(String[] args) {
		
		int a[]= {9,1,4,6,9,8};
		
	System.out.println(a[solve(a,0,a.length-1)]);
		
		
		

	}
	static int solve(int a[],int lo,int hi) {
		while(lo<=hi) {
			System.out.println(lo+"-"+hi);
			if(a[lo]<a[hi])return lo;
			int mid=(lo+hi)/2;
			if(a[mid]<a[(mid-1+a.length)%a.length] )return mid;
			System.out.println(mid);
			if(a[lo]<a[mid]	) {
				lo=mid+1;
			}
			else if(a[mid]<a[hi]) {
				hi=mid-1;
			}else {
				lo++;
			}
		}
		
		return 0;
//		;
	}
	

	 
	
	 
	
}
