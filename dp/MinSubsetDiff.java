package dp;

import java.io.*;
import java.util.ArrayList;


public class MinSubsetDiff {
	static boolean dp[][];
	public static void main(String[] args) throws IOException {
		Reader sc= new Reader();
		int n=sc.nextInt();
		int sum=0;
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		int dif=sc.nextInt();
		dp= new boolean[n+1][sum+1];
		System.out.println(minDif(a,sum,dif));
//		for(int i=0;i<=n;i++) {
//			for(int j=0;j<=sum;j++) {
//				dp[i][j]=-1;
//			}
//		}

	}
	static void subsetSum(int a[],int sum,int n) {
		//initialization.
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=sum;j++) {
				if(i==0) {
					dp[i][j]=false;
				}
				if(j==0) {
					dp[i][j]=true;
				}
			}
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sum;j++) {
				if(a[i-1]<=j) {
					dp[i][j]=dp[i-1][j-a[i-1]] || dp[i-1][j];
				}else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
	}
	static int minDif(int a[],int sum,int diff) {
		subsetSum(a,sum,a.length);
		ArrayList<Integer>al= new ArrayList<>();
		for(int j=0;j<=sum/2;j++) {
			if(dp[a.length][j]) {
				al.add(j);
			}
		}
		int min=Integer.MAX_VALUE;
//		for(int i=0;i<al.size();i++) {
//			min=Math.min(min, sum-2*al.get(i));
//		}
		
		
		
		//to count subset with given diff.
		min=0;
		for(int i=0;i<al.size();i++) {
			if( (sum-2*al.get(i))==diff) {
				min++;
			}
		}
		System.out.println(al);
		return min;
	}

	
	
	
	
	
	
	
	
	
	

	 static class Reader   // here reader class is defined.
	    { 
	        final private int BUFFER_SIZE = 1 << 16; 
	        private DataInputStream din; 
	        private byte[] buffer; 
	        private int bufferPointer, bytesRead; 
	  
	        public Reader() 
	        { 
	            din = new DataInputStream(System.in); 
	            buffer = new byte[BUFFER_SIZE]; 
	            bufferPointer = bytesRead = 0; 
	        } 
	  
	        public Reader(String file_name) throws IOException 
	        { 
	            din = new DataInputStream(new FileInputStream(file_name)); 
	            buffer = new byte[BUFFER_SIZE]; 
	            bufferPointer = bytesRead = 0; 
	        } 
	  
	        public String readLine() throws IOException 
	        { 
	            byte[] buf = new byte[64]; // line length 
	            int cnt = 0, c; 
	            while ((c = read()) != -1) 
	            { 
	                if (c == '\n') 
	                    break; 
	                buf[cnt++] = (byte) c; 
	            } 
	            return new String(buf, 0, cnt); 
	        } 
	  
	        public int nextInt() throws IOException 
	        { 
	            int ret = 0; 
	            byte c = read(); 
	            while (c <= ' ') 
	                c = read(); 
	            boolean neg = (c == '-'); 
	            if (neg) 
	                c = read(); 
	            do
	            { 
	                ret = ret * 10 + c - '0'; 
	            }  while ((c = read()) >= '0' && c <= '9'); 
	  
	            if (neg) 
	                return -ret; 
	            return ret; 
	        } 
	  
	        public long nextLong() throws IOException 
	        { 
	            long ret = 0; 
	            byte c = read(); 
	            while (c <= ' ') 
	                c = read(); 
	            boolean neg = (c == '-'); 
	            if (neg) 
	                c = read(); 
	            do { 
	                ret = ret * 10 + c - '0'; 
	            } 
	            while ((c = read()) >= '0' && c <= '9'); 
	            if (neg) 
	                return -ret; 
	            return ret; 
	        } 
	  
	        public double nextDouble() throws IOException 
	        { 
	            double ret = 0, div = 1; 
	            byte c = read(); 
	            while (c <= ' ') 
	                c = read(); 
	            boolean neg = (c == '-'); 
	            if (neg) 
	                c = read(); 
	  
	            do { 
	                ret = ret * 10 + c - '0'; 
	            } 
	            while ((c = read()) >= '0' && c <= '9'); 
	  
	            if (c == '.') 
	            { 
	                while ((c = read()) >= '0' && c <= '9') 
	                { 
	                    ret += (c - '0') / (div *= 10); 
	                } 
	            } 
	  
	            if (neg) 
	                return -ret; 
	            return ret; 
	        } 
	  
	        private void fillBuffer() throws IOException 
	        { 
	            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
	            if (bytesRead == -1) 
	                buffer[0] = -1; 
	        } 
	  
	        private byte read() throws IOException 
	        { 
	            if (bufferPointer == bytesRead) 
	                fillBuffer(); 
	            return buffer[bufferPointer++]; 
	        } 
	  
	        public void close() throws IOException 
	        { 
	            if (din == null) 
	                return; 
	            din.close(); 
	        } 
	    }
	    
	    
	    
	  
}
