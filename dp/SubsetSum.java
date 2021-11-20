package dp;

import java.io.*;
import java.util.*;

public class SubsetSum {
static int dp[][];
	public static void main(String[] args) throws IOException {
		Reader sc= new Reader();
		int n=sc.nextInt();
		int a[]= new int [n];
		int sum=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		
		dp= new int[n+1][sum+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=sum;j++) {
				dp[i][j]=-1;
			}
		}
		// jusst to check if equal subset sum is possible or not
		// for eg {2,8,1,11} ->{2,8,1},{11}. so return true
		if(sum%2==0) {
			System.out.println(subsetSum(a,sum/2,n));
		}
		else {
			System.out.println("false");
		}
		
		
	}
	static boolean subsetSum(int a[],int sum,int n) {
		
		if(sum==0 && n==0) {
			dp[n][sum]=1;
			return true;
		}
		if(n==0 && sum!=0) {
			dp[n][sum]=0;
			return false;
		}
		if(a[n-1]>sum) {
			if(dp[n][sum]==-1)
			return subsetSum(a,sum,n-1);
			else if(dp[n][sum]==0) {
				return false;
			}
			else {
				return true;
			}
		}
		else {
			if(dp[n][sum]==-1) {
				if(subsetSum(a,sum,n-1) || subsetSum(a,sum-a[n-1],n-1)) {
					dp[n][sum]=1;
				}else {
					dp[n][sum]=0;
				}
			return subsetSum(a,sum,n-1) || subsetSum(a,sum-a[n-1],n-1);}
			else if(dp[n][sum]==0) {
				return false;
			}
			else {
				return true;
			}
		}
		
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
