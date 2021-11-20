package numberTheory.bitManipulation;

import java.util.*;

public class NumberOfSetBitsAsThatOfN {
// number of number less than n ..having same number of set bits.
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long n=sc.nextLong();
		int bits=numberofBits(n);
		//System.out.println(bits);
	long ans=	solve(n,bits,62);
	System.out.println(ans);
		
	}
	static long solve(long n,int k,int i) {
		if(i==0)return 0;
		long res=0;
//		long mask=(1<<i);
//		
		long mask=(1L<<i);
		//System.out.println(mask2);
		
		if( (mask&n)==0) {
			 res=solve(n,k,i-1);
		}else {
		//	System.out.println(i+" "+mask);
			long res1=solve(n,k-1,i-1);
			long res2=ncr(i,k); //select k bits for i places.
			res=res1+res2;
		}
		return res;
	}
	static long ncr(long n,long r) {
		if(n<r)return 0;
		if(r==0 || r==n)return 1;
		long res=1;
		for(long i=1;i<=r;i++) {
			res=res*(n-i+1);
			res/=i;
		}
		return res;
	}
	static int numberofBits(long n) {
		int ct=0;
		while(n>0) {
		long mask=n&(-n);
		n-=mask;
		ct++;
		}
		return ct;
		
	}

}
