package stack;

public class ImplementUsingArray {

	public static void main(String[] args) {
		int n=10;
		char[]stack= new char[n];
		int top=-1;
		push('a',stack,top);
		push('b',stack,top);
		push('c',stack,top);
		for(int i=0;i<=n-1;i++)
		System.out.print(stack[i]+" ");
		System.out.println();
		System.out.println(top);
		
		

	}
	static void push(char ch,char[]stack,int top) {
		stack[++top]=ch;
		
	}

}
