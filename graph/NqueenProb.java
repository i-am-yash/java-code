package graph;
import java.util.*;

public class NqueenProb {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int board[][]= new int[10][10];
		NqueenProb(board,0,n);

	}
	static boolean NqueenProb(int board[][],int i,int n) {
		if(i==n) {
			
			//print
			for(int k=0;k<n;k++) {
				for(int j=0;j<n;j++) {
					if(board[k][j]==1) {
						System.out.print("Q ");
					}
					else {
						System.out.print("_ ");
					}
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
			return true;  // return true if u donot want all the combination.
		}
		for(int j=0;j<n;j++) {
			if(isSafe(board,i,j,n)) {
				board[i][j]=1;
				boolean nextPosition=NqueenProb(board,i+1,n);
				if(nextPosition) {
					return true;
				}
				board[i][j]=0;
				
			}
		}
		
		return false;
	}
	static boolean isSafe(int board[][],int i,int j,int n) {
		//chec k for col
		for(int row=0;row<i;row++) {
			if(board[row][j]==1) {
				return false;
			}
		}
		//left diagonal
		int x=i;
		int y=j;
		while(x>=0 && y>=0) {
			if(board[x][y]==1) {
				return false;
			}
			x--;
			y--;
		}
		//right diagonal
				 x=i;
			       y=j;
				while(x>=0 && y<n) {
					if(board[x][y]==1) {
						return false;
					}
					x--;
					y++;
				}
		
		return true;
	}

}
