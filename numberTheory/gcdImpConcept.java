package numberTheory;

import java.util.*;

public class gcdImpConcept {
	
	static long phi[];
	
          // ans=gcd(1,n)+gcd(2,n)++++......gcd(n,n).
	//this concept genrally use when gcd sum is asked.
	
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    int t=sc.nextInt();
		ETF();
		System.out.println(phi[5]);
		while(t-->0) {
		int n=sc.nextInt();
		for(int i=0;i<1000;i++) {
			System.out.println(i+" "+phi[i]);
		}
		
		
		
		//instead of running in loop from 1 to n to find gcd and its sum.we can find             
		
		// for each divisor d how many numbers i are there with gcd(i,n)=d 
		//assume n=12.
		//-> gcd(1,12)=1   -> gcd(1,12)=1   gcd(2,12)=2   gcd(3,12)=3   gcd(4,12)=4  -> gcd(5,12)=1   gcd(6,12)=6
		//-> gcd(7,12)=1   gcd(8,12)=4   gcd(9,12)=3   gcd(10,12)=2   gcd(11,12)=1   gcd(12,12)=12
		
		//ans=1*(4) +2*(2)+ 3*(2)+ 4*(2)+ 6*(1)+ 12*(1)    ...here   1*(4) means there are 4 numbers with whom gcd with n is 1.....these are marked(->) above as example
		
		
		
		int res=0;
		
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				int d1=i;
				int d2=n/i;   //d1 adn d1 are divisor..
				res+=d1*getCount(d1,n);
				if(d1!=d2) {
					res+=d2*(getCount(d2,n));
				}
			}
		}
		System.out.println(res);
	}
		

	}
	static long getCount(int d,int n) {   //it returns number of integer from 1 to n whose gcd with n is d
		//we have to find number of value with gcd(xi,n)=d 
		//using property   gcd(xi/d,n/d)=1   now we have to caluclate numbers which are  co prime with n/d...ie gcd(x1,n/d)=1.
		
	
		return phi[n/d];
	}
	static void ETF() {
		//this method caluclate number of co prime number with n using Euler Totient Function
		phi= new long[1000002];
		int maxLen=phi.length;
		for(int i=1;i<maxLen;i++) {
			phi[i]=i;
		}
		for(int i=2;i<maxLen;i++) {
			if(phi[i]==i) { // that is prime factor.
				for(int j=i;j<maxLen;j+=i) {
					phi[j]=(phi[j] /i)*(i-1);             //phi[6] determines by 6/P1*(P1-1) /P2*(P2-1)...P1,P2 are prime factors of N i.e 6 here in this example.
				}
			}
		}
		
		
	}
	static int phi(int n)
	{
	    // Initialize result as n
	    int result = n;
	 
	    // Consider all prime factors
	    // of n and subtract their
	    // multiples from result
	    for (int p = 2; p * p <= n; ++p)
	    {
	         
	        // Check if p is
	        // a prime factor.
	        if (n % p == 0)
	        {
	             
	            // If yes, then update
	            // n and result
	            while (n % p == 0)
	                n /= p;
	            result -= result / p;
	        }
	    }
	 
	    // If n has a prime factor
	    // greater than sqrt(n)
	    // (There can be at-most
	    // one such prime factor)
	    if (n > 1)
	        result -= result / n;
	    return result;
	}

}
