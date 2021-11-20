package numberTheory;

import java.util.*;

public class modularExponentialAlgo {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
	try {	//x^y %p. algorithim
		long x=105,y=564,p=10000000007L;
		long ans=power(x,y,p);
		System.out.println(ans);
		

				
		
		
		
	}
	catch(Exception e) {
		
	}
		
}
	static long power(long x, long y,long p) 
	{ 
		if(y==0)return 1L;
      if(y==1) return x%p;
      long temp= power(x,y/2,p)*1L;
      temp=temp*1L * temp*1L;
      if(y%2==0)return temp%p*1L;
      else{
        return (temp%p * x%p)%p;

	}
}
}
