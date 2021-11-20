package introduction;

import java.util.Arrays;
// all stuednts must get atleast 1 candy,if rating of student is greater than its right or left neighbour
//  student gets more candy than its left orr right respectively.
public class ImpQ2 {
	static int noOfCandies(int a[],int n) {
		
		int c[]=new int[n];
		
		Arrays.fill(c,1);
		for(int i=1;i<n;i++) {
			if(a[i]>a[i-1])
			{
				c[i]=c[i-1]+1;
			}
		}
		for(int i=n-2;i>=0;i--) {
			if(a[i]>a[i+1]) {
				c[i]=Math.max(c[i+1]+1,c[i]);
			}
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=c[i];
		}
		
		
	
		return sum;
	}

	public static void main(String[] args) {
		int a[]= {1,2,2};   //array of student rating.
		int n=a.length;
		int totalCandies=noOfCandies(a,n);
		System.out.println(totalCandies);
		

	}

}
