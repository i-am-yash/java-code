package numberTheory.bitManipulation;

import java.util.*;

public class NqueenProblem {
	static ArrayList<String>al;
	static ArrayList<List<String>>all;

	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	int n=sc.nextInt();
	al= new ArrayList<>();
	all=new ArrayList<List<String>>();
	int board[][]= new int[n][n];
	int rows=0,cols=0,rdig=0,ndig=0;
	String ans="";
	solve(board,rows,cols,ndig,rdig);
	ArrayList<String>temp=new ArrayList<String>();
	for(int i=0;i<al.size();i++) {
		temp.add(al.get(i));
//		if((i+1)%4==0) {
//			System.out.println(temp);
//			all.add(temp);
//			temp.clear();
//		}
	}
	
	for(int i=0;i<al.size();i+=n) {
		if(n<4) {
			al.clear();
			al.add("Q");
			all.add(al);
			break;
		}
	all.add(al.subList(i, i+4));
	}
	System.out.println(all);
	}
	
	static void solve(int board[][],int rows,int cols,int ndig,int rdig) {
		if(rows==board.length) {
		for(int i=0;i<board.length;i++) {
			String temp="";
			for(int j=0;j<board.length;j++) {
				if(board[i][j]==0) {
					temp+=".";
				}else {
					temp+="Q";
				}
			}
			al.add(temp);
			//System.out.println();
		}
			
			return ;
		}
		
		for(int col=0;col<board.length;col++) {
			
			if( ( (cols&(1<<col))==0) &&
					( (ndig & (1<<(rows+col )))==0) &&
					((rdig&(1<<(rows-col+board.length-1)))==0)
				
					) {
				board[rows][col]=1;
				
			
				cols^=(1<<col);
				rdig^=(1<<(rows-col+board.length-1));
				ndig^=(1<<(rows+col));
				
				
				solve(board,rows+1,cols,ndig,rdig);
				cols^=(1<<col);
				rdig^=(1<<(rows-col+board.length-1));
				ndig^=(1<<(rows+col));
				board[rows][col]=0;
				
				
				
			}
			
			
				
		}
	}
	

}