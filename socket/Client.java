package socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
	private static Socket socket=null;
//	private static DataInputStream input=null;
//	private static DataOutputStream output=null;

	public static void main(String[] args)throws IOException {
		socket = new Socket("localhost",9999);
		//Scanner sc= new Scanner(System.in);
		//String str=sc.next();
		String str="yasb jghh";
		OutputStreamWriter os = new OutputStreamWriter(socket.getOutputStream());
		PrintWriter out= new PrintWriter(os);
	out.print(str);
	out.close();

	}

}
