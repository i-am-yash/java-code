package recurrsion;

public class ShortestPath {

	public static void main(String[] args) {
		int path[][]= {
				{1,1,1},
				{0,1,0},
				{1,1,0},        // only we can traverse on 1s.
				{0,1,0},
				{1,1,1},
				{0,0,1},
				{1,0,1},
				{1,1,1},
				
				
				
		};
		int res=shortPath(path,0,0,6,0);
		if(res>=1000) {
			System.out.println("no path");
		}
		else {
		System.out.println(res);}
		
		

	}
	static int shortPath(int a[][],int i,int j,int x,int y) {           // x,y are coordinates of destination.
		int rows=a.length;
		int cols=a[0].length;
		boolean vis[][]= new boolean[rows][cols];
		return shortPath(a,i,j,x,y,vis);
	
	}
	static int shortPath(int a[][],int i,int j,int x,int y,boolean vis[][]) {
		if(!isValid(a,i,j,x,y,vis)) {
			return 1000;
		}
		if(i==x && j==y) {
			return 0;
		}
		vis[i][j]= true;
		int left=shortPath(a,i,j-1,x,y,vis)+1;
		int right=shortPath(a,i,j+1,x,y,vis)+1;
		int up=shortPath(a,i+1,j,x,y,vis)+1;
		int down=shortPath(a,i-1,j,x,y,vis)+1;
		
		// this line making it backtracking.
		vis[i][j]=false;
		return Math.min(Math.min(left, right), Math.min(up, down));
		
	}
	static boolean isValid(int a[][],int i,int j,int x,int y,boolean vis[][]) {
		int rows=a.length;
		int cols=a[0].length;
		return i>=0 && j>=0 &&i<rows && j<cols && !vis[i][j]&& a[i][j]==1;
	}

}
