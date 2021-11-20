package leetcode;

import java.util.*;





public class ValidTriangle {


	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int  a[]= new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				
			}
			System.out.println(solution(a));
	//		System.out.println(binarySearch(a,0,n-1,6));
	
		
		
		

	}
	static int solution (int a[]) {
		Arrays.sort(a);
		int n=a.length;
		int ct=0;
		for(int i=0;i<n-2;i++) {
			int x=a[i];
			for(int j=i+1;j<n-1;j++) {
				int y=a[j];
				int ind=binarySearch(a,j+1,n-1,x+y);
				if(ind==-1)continue;
				ct+=ind-j;
				
			}
		}
		
		return ct;
		
		
	}
	static int binarySearch(int a[],int lo,int hi,int sum) {
		int index=-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(a[mid]>=sum) {
				hi=mid-1;
			}else {
				index=mid;
				lo=mid+1;
				
			}
			
		}
		return index;
	}
	
	 
	
}
