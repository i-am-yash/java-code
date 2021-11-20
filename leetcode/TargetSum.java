package leetcode;

import java.util.*;





public class TargetSum {
	static HashMap<String,Integer>dp;
	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int a[]= new int [n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		int target=sc.nextInt();
		dp=new HashMap<>();
		System.out.println(solve(a,n,target));
		System.out.println(dp);
		
		
		
		
//		
// -3 0 -2 k= 100
	}
	static int solve(int a[],int n,int target) {
		String index="";
		index=index.concat("index"+n+"target"+target);
		if(dp.get(index)!=null)return dp.get(index);
		if(n==0) {
			if(target==0) {
				dp.put(index, 1);
				return 1;
			}
			else {
				dp.put(index, 0);
				return 0;
			}
		}
		dp.put(index,  solve(a,n-1,target+a[n-1])+ solve(a,n-1,target-a[n-1]) );
		return dp.get(index);
		
	}
	
}
