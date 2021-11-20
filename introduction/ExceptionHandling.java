package introduction;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
		  int a=6;
		  int b=0;
		  int c=a/b;
		  System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage()+" occured,plz check your code");}
		System.out.println("imp codes");
		System.out.println("need to run");
		
			
		
		

	}

}
