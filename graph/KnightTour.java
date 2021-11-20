package graph;
import java.util.*;

public class KnightTour {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		int chess[][]= new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				chess[i][j]=-1;
			}
		}
		
		kt(chess,1,r,c);
		
	}
	static void kt(int [][]chess,int count,int x,int y) {
		if(x<0 || y<0 || x>=chess.length || y>=chess.length || chess[x][y]>0) {
			return ;
		}else if(count>=(chess.length * chess.length)) {
			chess[x][y]=count;
			for(int i=0;i<chess.length;i++) {
				for(int j=0;j<chess.length;j++) {
					System.out.print(chess[i][j]+" ");
				}
				System.out.println();
			}
			chess[x][y]=0;
			return;
		}
		chess[x][y]=count;
		
		kt(chess,count+1,x+1,y-2);
		kt(chess,count+1,x-1,y-2);
		kt(chess,count+1,x+2,y-1);
		kt(chess,count+1,x-2,y-1);
		kt(chess,count+1,x+1,y+2);
		kt(chess,count+1,x-1,y+2);
		kt(chess,count+1,x+2,y+1);
		kt(chess,count+1,x-2,y+1); 
		chess[x][y]=0;
		
	}
	

}
