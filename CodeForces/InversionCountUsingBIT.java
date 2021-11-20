package CodeForces;

import java.io.*;

public class InversionCountUsingBIT {
	static class FenwickTree{
		int tree[];
	
		void contructFenwickTree(int n) {
			n++;
			tree= new int[n];
		}
		
	     void update(int i,int delta,int n) {      //delta means newValue - preValue.
	    	                                         //i is index of array.
	    	i++;
	    	while(i<=n) {
	    		tree[i]+=delta;
	    		i=i+Integer.lowestOneBit(i);
	    	}
	    }
	      int getSum(int i ){
	     	int sum=0;
	     	i++;
	     	while(i>0) {
	     		sum+=tree[i];
	     		i-=Integer.lowestOneBit(i);
	     	}
	     	return sum;
	     }
	      int rangeOfSum(int i,int j) {
	    	  return getSum(j)-getSum(i-1);
	      }
	      int countInversions(int a[]) {
	    	  int ct=0;
	    	  int maxValue=tree.length-2;
	    	  for(int i=0;i<a.length;i++) {
	    		  ct+=getSum(maxValue)-getSum(a[i]);
	    		  update(a[i],1,maxValue+1);
	    	  }
	    	  return ct;
	      }
		
	}


	public static void main(String[] args) throws IOException {
		Reader sc= new Reader();
		int n=sc.nextInt();
		int a[]= new int[n];
		int max=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			max=Math.max(max, a[i]);
		}
		FenwickTree ft= new FenwickTree();
		ft.contructFenwickTree(max+1);
		System.out.println(ft.countInversions(a));

		
		
		

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
