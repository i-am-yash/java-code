package leetcode;

import java.util.*;

public class NextPermutation {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		solve(a);
		System.out.println(Arrays.toString(a));


	}
	static void solve(int a[]) {
		int n=a.length;
		int indx=-1;
		int indy=-1;
		for(int i=n-2;i>=0;i--) {
			if(a[i]<a[i+1]) {
				indx=i;
				break;
			}
		}
		if(indx==-1) {
			//decreasing sorted
			Arrays.sort(a);
			return;
		}
		for(int i=n-1;i>=indx;i--) {
			if(a[i]>a[indx]) {
				indy=i;
				break;
			}
		}
//		System.out.println(indx+" "+indy);
		int temp=a[indx];
		a[indx]=a[indy];
		a[indy]=temp;
		//reverse 
		reverse(indx+1,a);
		
		
		
		
	} 
	static void reverse(int i,int a[]) {
		int n=a.length-i;
		int temp[]= new int[n];
		int k=0;
		for(int j=a.length-1;j>=i;j--) {
			temp[k++]=a[j];
		}
		k=0;
		for(int j=i;j<a.length;j++) {
			a[j]=temp[k++];
//			System.out.println(a[j]+" bg");
		}
//		System.out.println(Arrays.toString(temp));
	}
	

	
	
}
