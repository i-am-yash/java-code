package introduction;

public class CreateMyStack {

	public static void main(String[] args) throws Exception {
		MyStack<Integer> stack=new MyStack<Integer>();
	  stack.push(12);
	  stack.push(14);
	  stack.push(13);
	  int poped=stack.pop();
	   poped=stack.pop();
	   poped=stack.pop();
	   poped=stack.pop();
	  //System.out.println(poped);
	  int peeked=stack.peek();
	  System.out.println(poped);
		
		

	}

}
