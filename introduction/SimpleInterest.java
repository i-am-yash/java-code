package introduction;
import java.util.Scanner;

import com.sun.tools.sjavac.server.SysInfo;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time= sc.nextInt();
		float si= principal * rate * time /100;
		System.out.print("simple interest is" +" "+ si);
		
		

	}

}