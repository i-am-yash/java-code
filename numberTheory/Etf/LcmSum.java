package numberTheory.Etf;

import java.io.*;
// spoj or gfg lcm sum.

public class LcmSum {
	static long phi[];

	public static void main(String[] args)throws IOException  {
		
		Reader  sc=new Reader();
		PrintWriter w= new PrintWriter(System.out);
		ETF();
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			double gcdSum=gcdSum( n);
			gcdSum=gcdSum-(1.0/n); // sum upto n-1 terms in recprocol.
//			System.out.println(gcdSum);
//			gcdSum=gcdSum*n*n;
//			System.out.println(gcdSum);
			long sum=(long)(gcdSum*n*n);
			sum+=2*n;
			sum/=2;
			w.println(sum);	
		}
		
		
		
		 
		 
		  
		w.close();
	    
	   
		
        	
        	
		
		
	}
	static void ETF() {
		//this method caluclate number of co prime number with n using Euler Totient Function
		phi= new long[1000002];
		int maxLen=phi.length;
		for(int i=1;i<maxLen;i++) {
			phi[i]=i;
		}
		for(int i=2;i<maxLen;i++) {
			if(phi[i]==i) { // that is prime factor.
				for(int j=i;j<maxLen;j+=i) {
					phi[j]=(phi[j] /i)*(i-1);             //phi[6] determines by 6/P1*(P1-1) /P2*(P2-1)...P1,P2 are prime factors of N i.e 6 here in this example.
				}
			}
		}
		
		
	}
	static double gcdSum(int n) {
		double sum=0;
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				int d1=i;
				int d2= n/i;
				long ct1=phi[n/d1];
				long ct2=phi[n/d2];
				sum+=(ct1*1.0/d1)+(ct2*1.0/d2);
			}
		}
		return sum;                             // sum of gcd in reciprocol
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