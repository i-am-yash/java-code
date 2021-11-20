package introduction;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("enter the length of aray");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int min_indx=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{a[i]=sc.nextInt();}
		
		
		for(int i=0;i<n;i++)
		{	int min=a[i];
		for(int j=i;j<n;j++)
		{  if(a[j]<=min)
		{min=a[j];
		 min_indx=j;
		}
		}
		int t=a[i];
		a[i]=min;
		a[min_indx]=t;}
		System.out.println("sorted array is ");
		for(int item:a)
		{System.out.print(+item +" ");
		}
		
		
		
			


	}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		


