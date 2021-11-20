package introduction;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		for(int i=2;i<n;i++)
		{   boolean flag=true;
			for(int j=2;j*j<i;j++)
		{  if(i%j==0)
			{flag=false;
			break;
			}
		
		}
			if(flag==true)
			{System.out.print(" ");
				System.out.print(+i);
			}
			
		

	}

}}
