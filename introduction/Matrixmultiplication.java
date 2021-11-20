package introduction;

import java.util.Scanner;

public class Matrixmultiplication {

	public static void main(String[] args) {
		System.out.println("Enter dimensions for array a:");
		Scanner sc=new Scanner(System.in); 
		int rows1=sc.nextInt();
		int cols1=sc.nextInt();
		System.out.println("Enter dimensions for array b:");
		int rows2=sc.nextInt();
		int cols2=sc.nextInt();
		int a[][]= new int[rows1][cols1];
		int b[][]=new int[rows2][cols2];
		if(cols1==rows2)
		{
		System.out.print("enter aray a:");
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols1;j++)
				a[i][j]=sc.nextInt();
		}
		
		
		
		System.out.print("enter aray b:");
		
		for(int i=0;i<rows2;i++)
		{
			for(int j=0;j<cols2;j++)
				b[i][j]=sc.nextInt();
		}
	
		
		int res[][]= new int[rows1][cols2];
		for(int i=0;i<rows1;i++)
		{for(int j=0;j<cols2;j++)
		{res[i][j]=0;
			for(int k=0;k<cols1;k++)
			res[i][j]+=a[i][k] * b[k][j];
			}
		
		System.out.println();
		}
		System.out.println("rsulting matrix is ");
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols2;j++)
				System.out.print(res[i][j]);
			System.out.println();
		}}
		else
		{System.out.println("invalid entry");}
		

		

	

}
}
