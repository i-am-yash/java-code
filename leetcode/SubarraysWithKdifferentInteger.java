package leetcode;

import java.util.*;



public class SubarraysWithKdifferentInteger {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		int target=sc.nextInt();
		//int k=sc.nextInt();
		
		System.out.println(solve(a,target)-solve(a,target-1));
		
// 10,5,2,6 k= 100
	}
	static int solve(int a[],int k) {
	int max=0;
	HashMap<Integer,Integer>map=new HashMap<>();
	int l=0;
	int r=0;
//	int product=1;
	int ans=0;
	for(;r<a.length;r++) {
		map.put(a[r], map.getOrDefault(a[r], 0)+1);
			//System.out.println(ans);
			while(l<=r && map.size()>k) {
				map.put(a[l], map.get(a[l])-1);
				if(map.get(a[l])==0)map.remove(a[l]);
				
				l++;
			}
			System.out.println(l+" "+r+" "+k);
		
			ans+=r-l+1;
		
		
	}
	
	return ans;
	
	


	
	}
}
