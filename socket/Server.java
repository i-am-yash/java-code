package socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;



public class Server {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("server is started");
		ServerSocket ss= new ServerSocket(9999);
		System.out.println("server is waiting for client");
		Socket socket=ss.accept();
		System.out.println("client connected");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String str=br.readLine();
		System.out.println("client Data :"+str);
		
	}

}
