package dp;

import java.util.*;

public class MCMminimumCost {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(solve(a,1,a.length-1));
	}
	static int solve(int a[],int i,int j) {
		if(i==j)return 0;
		int ans=Integer.MAX_VALUE;
		for(int k=i;k<=j;k++) {
			int tempAns=solve(a,i,k)+solve(a,k+1,j)+a[i-1]*a[k]*a[j];
			ans=Math.min(ans, tempAns);
		}
		return ans;
	}

}
