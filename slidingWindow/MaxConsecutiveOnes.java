package slidingWindow;

import java.util.HashMap;
import java.util.Scanner;



public class MaxConsecutiveOnes {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		int target=sc.nextInt();
		//int k=sc.nextInt();
		
		System.out.println(solve(a,target));
		

	}
	static int solve(int a[],int k) {
	int max=0;
	HashMap<Integer,Integer>map=new HashMap<>();
	int l=0;
	int r=0;
	map.put(1,0);
	for(;r<a.length;r++) {
		if(a[r]==1) {
			map.put(1,map.get(1)+1);
		}
		if(r-l+1 -map.get(1)<=k) {
			max=Math.max(max, r-l+1);
		}else {
			while(r-l+1 -map.get(1)>k) {
				if(a[l]==1) {
					map.put(1, map.get(1)-1);
					
				}
				l++;
			}
		}
	}
	return max;
	
	


	
	}
}