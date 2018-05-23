package sockets;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


public class ClientSocket{
	
	Socket clientSocket;
	public ClientSocket() {
		// TODO Auto-generated constructor stub
		try {
			clientSocket = new Socket( "127.0.0.1",7000);
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The server is not connected");
		}
		
		try {
			InputStream in = clientSocket.getInputStream();
			OutputStream out = clientSocket.getOutputStream();
			
			BufferedReader br1 = new BufferedReader( new InputStreamReader(in) );
			String str1 = "Hello World!";
			PrintWriter pw = new PrintWriter(out);
			System.out.print(str1);
			pw.println(str1);
			pw.flush();
			
			
			//We should not close the Socket HERE!!!! other

			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	
	public void getFeedBack(){
		
		try {
			InputStream in = clientSocket.getInputStream();
			BufferedReader br1 = new BufferedReader( new InputStreamReader(in) );
			String str = br1.readLine();
			System.out.println(str);
//			br1.close();
//			in.close();
			clientSocket.close();
			//when the socket shuts down the in and out also shut down
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	



}



