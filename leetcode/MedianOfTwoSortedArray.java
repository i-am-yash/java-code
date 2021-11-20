package leetcode;

import java.io.*;
import java.util.*;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) throws IOException {
		Reader sc= new Reader();
		PrintWriter w= new PrintWriter(System.out);
		int n=sc.nextInt();
		int a[]= new int[n];
		int m=sc.nextInt();
		int b[]= new int[m];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		double ans=getMedian(a,b);
		w.println(ans);
		w.close();

	}
	static double getMedian(int a[],int b[]) {
		if(a.length>b.length) {
			return getMedian(b,a); //ensuring a.length /b.legth.
		}
		int strt=0;
		int end=a.length;
		while(strt<=end) {
			int partionX=(strt+end)/2;
			int partionY=(a.length+b.length+1)/2-partionX;
			int maxLeftX=partionX==0?Integer.MIN_VALUE:a[partionX-1];
			int minRightX=partionX==a.length?Integer.MAX_VALUE:a[partionX];
			int maxLeftY=partionY==0?Integer.MIN_VALUE:b[partionY-1];
			int minRightY=partionY==b.length?Integer.MAX_VALUE:b[partionY];
			if(maxLeftX<=minRightY && maxLeftY<=minRightX) {
				if((a.length+b.length)%2==0) {
					return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY) )/2.0;
				}
				else {
					return Math.max(maxLeftX, maxLeftY);
					
				}
			}
			if(maxLeftX>minRightY) {
				end=partionX-1;
			}
			else {
				strt=partionX+1;
			}
		}
		return 0;
		
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
