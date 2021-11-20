package leetcode;

import java.util.*;



public class RotatedSortedArray2 {
	static List<List<Integer>>ans;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ans=new ArrayList<List<Integer>>();
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		boolean ans=solve(a,0,a.length-1,target);
		System.out.println(ans);
		

	}
	static boolean solve(int a[],int lo,int hi,int target) {
		while(lo<=hi) {
			System.out.println(lo+" "+hi);
			int mid=(lo+hi)/2;
			if(a[mid]==target || a[lo]==target || a[hi]==target)return true;
			if(lo==hi)return false;
			if(a[mid]>a[lo]) {
				//sorted from lo to mid
				if(target>a[lo]  && target<a[mid]) {
					hi=mid-1;
					
				}else {
					lo=mid+1;
				}
					
			}
			else if(a[mid]<a[lo]) {
//				sorted from mid+1 to hi
				if(target>a[mid] && target<a[hi]) {
					lo=mid+1;
				} else {
					hi=mid-1;
				}
				
				
			}else {
				lo++;
			}
			
		}
		
		
		return false;
		
	}
	


	
	
}
