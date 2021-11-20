package numberTheory;
import java.util.*;

public class MatrixExponentiationAlgo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int z=sc.nextInt();
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    long T[][]={
		        {x,y,z},
		        {1,0,0},
		        {0,0,1}};
		   
		    long F[][]={
		        {1},
		        {1},
		        {1}};
		        
		  T=power(T,n-2);
		  long [][]ans= new long[3][1];
		  ans= multiplyMatrix(3,3,T,3,1,F);
		long value= (long) ans[0][0] ;
		System.out.println(value%m);
		  
		}
	}
		static long[][] power(long [][]a,int n){
		if(n==1) return a;
		
		long [][] temp= new long[3][3];
		long [][] temp2= new long[3][3];
		temp=power(a,n/2);
		temp2=multiply(temp,temp);
		if(n%2!=0) {
			return multiply(a,temp2);
			
		}
		return temp2;
		
	}

	static long[] [] multiply(long a[][],long b[][]){
	    long [][] mul = new long[3][3];
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            mul[i][j] = 0;
            for (int k = 0; k < 3; k++)
                mul[i][j] += a[i][k]*b[k][j];
        }
    }
    return mul;

	}
	static long[][] multiplyMatrix( 
        int row1, int col1, long A[][], 
        int row2, int col2, long B[][]) 
    { 
        int i, j, k; 
  
       
  
        // Matrix to store the result 
        // The product matrix will 
        // be of size row1 x col2 
        long C[][] = new long[row1][col2]; 
  
        // Multiply the two marices 
        for (i = 0; i < row1; i++) { 
            for (j = 0; j < col2; j++) { 
                for (k = 0; k < row2; k++) 
                    C[i][j] += A[i][k] * B[k][j]; 
            } 
        } 
  
        return C;
    } 
}
