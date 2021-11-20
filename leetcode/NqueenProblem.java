package leetcode;

import java.util.*;


public class NqueenProblem {
	static HashSet<String>set;
	static List<List<String>>ans;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		set=new HashSet<String>();
		int board[][]=new int[n][n];
		ans=new ArrayList<List<String>>();
		nQueen(n,board,0);

System.out.println(ans);
		
		

	}
	static void nQueen(int n,int board[][],int i) {
		
		if(i==n) {
			List<String>temp=new ArrayList<String>();
			
			for(int k=0;k<n;k++) {
				String a="";
				for(int l=0;l<n;l++) {
					if(board[k][l]==1) {
						a+='Q';
					}else {
						a+='.';
					}
				}
				temp.add(a);
			}
			ans.add(temp);
			return;
		}
		for(int j=0;j<n;j++) {
			if(valid(board,i,j)) {
				board[i][j]=1;	
				nQueen(n,board,i+1);		
				board[i][j]=0;
				set.remove(j+"column");
				set.remove((i-j)+"pos diagonal");
				set.remove(i+j+"negative diagonal");
//				System.out.println(set);

				
				
				
			}
		}

		return;
		
		
		
		
		
	}
	static boolean valid(int board[][],int i,int j) {
		
		if(!(set.contains(j+"column"))&& (!(set.contains ((i-j)+"pos diagonal") ) ) && !(set.contains(i+j+"negative diagonal")) ) {
			set.add(j+"column");
			set.add( (i-j)+"pos diagonal");
			set.add(i+j+"negative diagonal");
			return true;
			
		}
		return false;
		
		
	
	}
	static boolean isSafe(int chess[][],int row, int col) {
		for(int i=row-1,j=col;i>=0;i--) {
			if(chess[i][j]==1) {
				return false;
			}
		}
		for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++) {
			if(chess[i][j]==1) {
				return false;
			}
		}
		for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
			if(chess[i][j]==1) {
				return false;
			}
		}
		return true;
	}
	

	
	

	
	
}
