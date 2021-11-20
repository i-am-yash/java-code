package numberTheory.Etf;

import java.io.*;

public class GcdExtreme {
	//spoj

		static long phi[];
		static long f[];
	        static long sum[];

		public static void main(String[] args)throws IOException  {
			
			Reader  sc=new Reader();
			PrintWriter w= new PrintWriter(System.out);
			ETF();
			prefixGcdSum();
		sum= new long[1000001];
		for(int i=1;i<sum.length;i++) {
			sum[i]=sum[i-1]+f[i]-i;
		}
		
			
		//	int t=sc.nextInt();
			while(true) {
				int n=sc.nextInt();
				if(n==0)break;
				
				w.println(sum[n]);
					
			
			
			
			}
			 
			 
			  
			w.close();
		    
		   
			
	        	
	        	
			
			
		}
		static void ETF() {
			//this method caluclate number of co prime number with n using Euler Totient Function
			phi= new long[1000001];
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
		static void prefixGcdSum() {
			f= new long[1000001];
			int n=f.length;
			for(int i=1;i<n;i++) {
				for(int j=i;j<n;j+=i) {
					f[j]+=i*(phi[j/i]);
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
