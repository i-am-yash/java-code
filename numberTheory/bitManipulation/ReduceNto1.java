package numberTheory.bitManipulation;

import java.util.*;

public class ReduceNto1 {

	public static void main(String[] args) {
		//reduce n to 1 in minimum operation
		//operations -> even n=n/2;
		//                odd n=n+1 
		//                   odd n= n-1.
		
		
		
		
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(solve(n));

	}
	static int solve(int n) {
		if(n==3) {
			return 2;
		}
		int ct=0;
		while(n>1) {
			if(n%2==0) {
				n=n/2;
				
			}else {
				if(n%4==1) {
					n--;
				}else {
					n++;
				}
			}
			ct++;
		}
		
		return ct;
	}

}
