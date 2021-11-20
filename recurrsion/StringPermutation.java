package recurrsion;

public class StringPermutation {

	public static void main(String[] args) {
		permutation("abc",0,2);

	}
	static void permutation(String s,int l,int r) {
		if(l==r) {
			System.out.println(s);
			return;
		}
		for(int i=l;i<=r;i++) {
			s=interchangeChar(s,l,i);
			permutation(s,l+1,r);
			s=interchangeChar(s,l,i);
		}
		
	}
	static String interchangeChar(String s,int a,int b) {
		char array[]=s.toCharArray();
		char temp=array[a];
		array[a]=array[b];
		array[b]= temp;
		return String.valueOf(array);
	}


}
