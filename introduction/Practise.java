package introduction;

import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
	 	Scanner sc=new Scanner(System.in);
    	double X,Y;
    	X=sc.nextDouble();
    	Y=sc.nextDouble();
    	if(X>Y){
    	    System.out.println(Y);
    	}
    	else{
    	    if(X%5==0 && Y-X-0.5>0){
    	        Y=Y-X-0.5;
    	    }
    	}
    	System.out.println(Y);


	}

}
