package recurrsion;

public class PathTrack {
	// to reach from starting bloack to end.

	public static void main(String[] args) {
		int path=path(2,2);
		System.out.println(path);
		

	}
	static int path(int m, int n) {
		if (m==1 || n==1)
			return 1;
		return path(m-1,n)+ path(m,n-1);
		
	}

}
