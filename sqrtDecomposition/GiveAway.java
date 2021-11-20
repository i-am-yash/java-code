package sqrtDecomposition;
import java.io.*;
import java.util.*;


// spoj problem
// each block conatians number in sorted ...then find the lower bound i.e num just less than c...then count the number larger than c...

public class GiveAway  {
	

	

	public static void main(String[] args)throws IOException  {
		
		Reader  sc=new Reader();
		PrintWriter w= new PrintWriter(System.out);
	//	long sTime=System.nanoTime();
		int n=sc.nextInt();
		long a[]= new long[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
		}
		int BLK=(int)Math.sqrt(n) +1;
		ArrayList<Long> b[]= new ArrayList [BLK];
//		for(int i=0;i*i<n;i++) {
//			b[i]= new ArrayList<Integer>();
//		}
		for(int i=0;i<n;i++) {
			if(i%BLK==0) {
				b[i/BLK]= new ArrayList<Long>();
			}
		
			b[i/BLK].add(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]!=null)
			Collections.sort(b[i]);
		}
		int q=sc.nextInt();
		while(q-->0) {
			//System.out.println("qq");
			int check=sc.nextInt();
			if(check==1) {
			//	System.out.println("one");
				//int t=0;
				int indx=sc.nextInt()-1;
				long Newval=sc.nextLong();
				long curVal=a[indx];
				int blk=indx/BLK;
				if( b[blk]!=null)
					//System.out.println(b[blk]);
				update(b[blk],curVal,Newval);
				a[indx]=Newval;
				Collections.sort(b[blk]);
		//		System.out.println(t++);
			}else {
				int l=sc.nextInt()-1;
				int r=sc.nextInt()-1;
				int c=sc.nextInt();
				int lb=l/BLK;
				int rb=r/BLK;
				int ct=0;
				if(rb==lb) {
					for(int i=l;i<=r;i++) {
						if(a[i]>=c)ct++;
					}
					w.println(ct);
					continue;
				}
				for(int i=l;i< (lb+1)*BLK;i++) {
					if(a[i]>=c)ct++;
				}
				for(int i=rb*BLK;i<=r;i++) {
					if(a[i]>=c)ct++;
				}
				for(int i=lb+1;i<=rb-1;i++) {
				int index=	lowerBound(b[i],0,b[i].size()-1,c) ;
				ct+=b[i].size()-1-index;
				}
				w.println(ct);
			}
		}
		//System.out.println(Arrays.toString(b));
//	for(int i=0;i<b.length;i++) {
//		System.out.println(b[i]);
//	}
//		long eTime=System.nanoTime();
//		System.out.println(eTime-sTime);
	
		  
		w.close();
	    
	   
		
       	
       	
		
		
	}
	static void update(ArrayList<Long>a,long Cval,long Nval) {
		
		int lo=0;
		int hi=a.size()-1;
	//	System.out.println(hi);
		while(lo<=hi) {
		//	System.out.println("in update");
			int mid=(lo+hi)/2;
	//	System.out.println("midVal"+mid);
			if(a.get(mid)==Cval) {
				//System.out.println("mid");
				a.set(mid, Nval);
				break;
			}
			else if(a.get(mid)<Cval) {
				//System.out.println("less");
				lo=mid+1;
			}else {
				//System.out.println("more");
				hi=mid-1;
			}
		}
		//System.out.println("hi");
	//	//Collections.sort(a);
	}
	static int lowerBound(ArrayList<Long>a,int l,int r,long k) {
		//return index a[index] is largest number less than k in array
		int indx=0;
		while(l<=r) {
			int mid=(l+r)/2;
			if(a.get(mid)>=k) {
				r=mid-1;
			}
			else {
				indx=mid;
				l=mid+1;
			}
		}
		
		return indx;
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
