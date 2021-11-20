package leetcode;

import java.util.*;



public class WordSearch {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		char board[][]=new char [m][n];
		boolean vis[][]=new boolean[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]=sc.next().toCharArray()[0];
				vis[i][j]=false;
			}
		}
		String s=sc.next();
		
		int k=0;
			System.out.println(solve(board,0,0,s));
		

	}
	static boolean solve(char a[][],int i,int j,String word) {
		for( i=0;i<a.length;i++) {
			for(j=0;j<a[0].length;j++) {
				if(a[i][j]==word.charAt(0) && dfs(a,i,j,word,0)) {
					return true;
				}
			}
		}
		return false;
	}
	static boolean dfs(char a[][],int i,int j,String word,int count) {
		if(count==word.length())return true;
		if(i>=a.length || j>=a[0].length || i<0 ||j<0 || a[i][j]!=word.charAt(count))return false;
		
		
		char  temp=a[i][j];
		a[i][j]=' ';
		boolean found =dfs(a,i-1,j,word,count+1) || dfs(a,i,j+1,word,count+1) || dfs(a,i+1,j,word,count+1) || dfs(a,i,j-1,word,count+1);
		a[i][j]=temp;
		return found;
		
	}


	
	
}
