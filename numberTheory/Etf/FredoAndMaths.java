package numberTheory.Etf;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FredoAndMaths {
	// hacker earth problem.
static	long phi[];

	public static void main(String[] args) throws IOException {
Reader sc= new Reader();	
int t=sc.nextInt();
ETF();
while(t-->0) {
	long x=sc.nextLong();
	long k=sc.nextLong();
	long m=sc.nextLong();
	long  res= solution(x,k,m);
	System.out.println(res);
}
	}
	static long solution(long x,long k,long m) {
		if(m==1)return 0;
		if(k==0)return 1;
		return pow(x,solution(x,k-1,phi[(int)m]),m);
		
	}
	static void ETF() {
		//this method caluclate number of co prime number with n using Euler Totient Function
		phi= new long[10000002];
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
	static long pow(long x,long n,long mod) {
		long res = 1;
        x %= mod;
        while(n>0){
            if(n%2==1){
                res = (res*x)%mod;
            }
            x = (x*x)%mod;
            n /= 2;
        }
        return res;
		
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
