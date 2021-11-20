package numberTheory.bitManipulation;

import java.util.*;

public class NumberOfTriplets {
	 //i<=j<=k  a[i]^a[i+1]...a[j]=a[j+1]^a[j+2]...a[k]
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(solve(a));
		
	}
	static int solve(int a[]) {
		int ct=0;
		int val=0;
		for(int i=0;i<a.length;i++) {
			val=a[i];
			for(int k=i+1;k<a.length;k++) {
				val=val^a[k];
				if(val==0) {
					ct+=k-i;
				}
			}
		}
		return ct;
	}

}
