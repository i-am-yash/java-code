package introduction;

import java.util.Arrays;

public class ImpQuestion1 {
	
	// to find triplets whose sum equals 0 in array.
	// Two pointer algorithim.
	
	static boolean twoSums(int a[],int x,int i) {
		int j=a.length-1;
		while(i<j) {
			if(a[i]+a[j]<x) {
				i++;
			}
			else if(a[i]+a[j]>x) {
				j--;
			}
			else {
				return true;
				
			}
			
		}
		return false;
	}
	static boolean findTriplets(int a[]) {
		Arrays.sort(a);
		int n=a.length-1;
		for(int i=0;i<n-2;i++) {
			if(twoSums(a,-a[i],i+1))
				return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		int arr[]= {-6,-4,0,4,5,8,-7};
		boolean res=findTriplets(arr);
		System.out.println(res);
		
	
		
		
		
		

	}

}
