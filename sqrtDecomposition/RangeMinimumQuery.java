package sqrtDecomposition;




import java.io.*;
import java.util.*;




public class RangeMinimumQuery  {
	
	static int BLKSIZE;
	

	public static void main(String[] args)throws IOException  {
		
		Reader  sc=new Reader();
		PrintWriter w= new PrintWriter(System.out);
		int n=sc.nextInt();
		BLKSIZE=(int)Math.sqrt(n) + 1;
		int b[]= new int[BLKSIZE];
		
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(i%BLKSIZE==0) {
				min=Integer.MAX_VALUE;
			}
			min=Math.min(min, a[i]);
			b[i/BLKSIZE]=min;
		}
	for(int i:b) {
		//System.out.println(i);
	}
		int q=sc.nextInt();
		while(q-->0) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			int lB=l/BLKSIZE;
			int rB=r/BLKSIZE;
			int ans=Integer.MAX_VALUE;
			if(lB==rB) {
				for(int i=l;i<=r;i++) {
					ans=Math.min(ans, a[i]);
				}
				w.println(ans);
				continue;
			}
			for(int i=l;i<(BLKSIZE*(lB+1));i++) {
				ans=Math.min(ans, a[i]);
			}
			for(int i=rB*BLKSIZE;i<=r;i++) {
				ans=Math.min(ans, a[i]);
			}
			for(int i=lB+1;i<=rB-1;i++) {
				ans=Math.min(ans, b[i]);
			}
			w.println(ans);
		}
	
		  
		w.close();
	    
	   
		
        	
        	
		
		
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
            byte[] buf = new byte[64]; // line mgth 
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
