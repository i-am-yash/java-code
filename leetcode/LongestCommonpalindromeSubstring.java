package leetcode;

public class LongestCommonpalindromeSubstring {
static boolean dp[][];
	public static void main(String[] args) {
		String a="cdbbdef";
		System.out.println(lcps(a));
		
	}
	static String lcps(String a) {
		int n=a.length();
		dp= new boolean[n][n];
		// initialization..
		int indxi=-1,indxj=-1;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(i==j) {dp[i][j]=true;
				indxi=i;
				indxj=j;
				}
				if(j-i==1) {
					if(a.charAt(i)==a.charAt(j)) {
						dp[i][j]=true;
						indxi=i;
						indxj=j;
					}else dp[i][j]=false;
				}
			}
		}
		for(int g=2;g<n;g++) {
			for(int i=0,j=g;j<n;i++,j++) {
			if(a.charAt(i)==a.charAt(j) && dp[i+1][j-1]) {
				dp[i][j]=true;
				indxi=i;
				indxj=j;
			}else dp[i][j]=false;
			}
		}
		
		for(int g=n-1;g>=0;g--) {
			for(int i=0,j=g;j<n;i++,j++) {
				if(dp[i][j]) {
					System.out.println(a.substring(i,j+1));
					
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
	//	System.out.println(indxi+" "+indxj);
	return a.substring(indxi,indxj+1);
	}

}
