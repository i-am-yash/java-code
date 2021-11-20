package leetcode;

import java.util.*;





public class TotalHammingDistance {
static List<Integer>ans;
static HashMap<String,Integer>dp;
static int max;
static boolean flag;

	
	public static void main(String[] args) {
		
		int a[]= {1000000000,900000000};
		
	System.out.println(solve(a));
		
		
		

	}
	static int solve(int a[]) {
		int ans=0;
		
		for(int i=0;i<32;i++) {
			int setbits=0;
			int offbits=0;
			int mask=1<<i;
			for(int j=0;j<a.length;j++) {
				if( (mask&a[j])!=0)setbits++;
				else offbits++;
				
			}
			ans+=(setbits*offbits);
			
			System.out.println(mask);
		}
		return ans;
//		;
	}
	

	 
	
	 
	
}
