package recurrsion;

public class StringReverse {

	public static void main(String[] args) {
	String name="binod";
reverse(name);
	}
	static void reverse(String s) {
		int n=s.length();
		if(n==0) {
			//System.out.print(s);
			return;
		}
		
		System.out.print(s.charAt(n-1));
		reverse(s.substring(0, n-1));
	}

}
