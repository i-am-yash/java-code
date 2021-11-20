package numberTheory.bitManipulation;

import java.util.*;

public class SudokuSolve {
	static int arr[][];

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 arr= new int[9][9];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int rows[]= new int[9];
		int cols[]= new int[9];
		int grid[][]= new int[3][3];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(arr[i][j]>0) {
					rows[i]|=(1<<arr[i][j]);
					cols[j]|=(1<<arr[i][j]);
					grid[i/3][j/3]|=(1<<arr[i][j]);
				}
			}
		}
		
		 solve(rows,cols,grid,0,0);
//		for(int i=0;i<9;i++) {
//			for(int j=0;j<9;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		 for(int t=0;t<9;t++) {
			//	System.out.println(Arrays.toString(arr[t]));
			}
	
		


	}
	static void solve(int rows[],int cols[],int [][]grid,int i,int j) {
//		if(i==9)return ;
//			
//			
//				if(a[i][j]==0) {
//					//int bit=a[i][j];
//					for(int num=1;num<=9;num++) {
//						if( ((rows[i] & (1<<num)) ==0) &&  ((cols[j] & (1<<num))==0) && ((grid[i/3][j/3] & (1<<num))==0)    ){
//							a[i][j]=num;
//							rows[i]^=(1<<num);
//							cols[j]^=(1<<num);
//							grid[i/3][j/3]^=(1<<num);
//							solve(a,rows,cols,grid,j==8?i+1:i,j==8?j=0:j+1); 
//							rows[i]^=(1<<num);
//							cols[j]^=(1<<num);
//							grid[i/3][j/3]^=(1<<num);
//							a[i][j]=0;
//						}
//					}
//				}else {
//					solve(a,rows,cols,grid,j==8?i+1:i,j==8?j=0:j+1); 
//				}
//			
//		
		
		
		 if (i == arr.length) {
				for(int k=0;k<9;k++) {
				for(int l=0;l<9;l++) {
					System.out.print(arr[k][l]+" ");
				}
				System.out.println();
			}
				
		      return ;
		    }

		    if (arr[i][j] != 0) {
		      solve( rows, cols, grid, j < 8 ? i : i + 1, j < 8 ? j + 1 : 0);
		    } else {
		      for (int num = 1; num <= 9; num++) {
		        if (((rows[i] & (1 << num)) == 0) && ((cols[j] & (1 << num)) == 0)
		            && ((grid[i / 3][j / 3] & (1 << num)) == 0)) {
		          rows[i] ^= (1 << num);
		          cols[j] ^= (1 << num);
		          grid[i / 3][j / 3] ^= (1 << num);
		          arr[i][j] = num;
		          solve( rows, cols, grid, j < 8 ? i : i + 1, j < 8 ? j + 1 : 0);
		          arr[i][j] = 0;
		          grid[i / 3][j / 3] ^= (1 << num);
		          cols[j] ^= (1 << num);
		          rows[i] ^= (1 << num);
		        }
		      }
		    }
		
	}

}
