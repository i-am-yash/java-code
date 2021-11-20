package introduction;

import java.util.Scanner;

public class BuubleSort {

	public static void main(String[] args) {
		System.out.println("Enter length of array");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int a[]= new int[n];
		System.out.println("enter elements of aray");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
		      {if(a[j]>a[j+1])
		      {int t=a[j];
		      a[j]=a[j+1];
		      a[j+1]=t;}
		}
		}
		System.out.println("sorted array is ");
		for(int item:a)                //item will go throuh all elements of array a.
			System.out.print(item + " ");

	}

}
