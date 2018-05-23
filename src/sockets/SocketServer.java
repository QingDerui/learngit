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


public class SocketServer {
	
	
	ServerSocket serverSocket;   
	public SocketServer(){
		try {
			serverSocket = new ServerSocket(7000);
			System.out.println("It works!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("connection failed");
			
		}
	}
	
	public void setOnServer() {

		try {
			Socket socket = serverSocket.accept();
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			PrintWriter pw = new PrintWriter(out);
			String str1 = br.readLine();
			if (str1.equals("Hello World!")) {

				pw.print("Message from server: Hello World!");
				pw.flush();
				System.out.println("Get it!");

			}
//			pw.close();
//			in.close();
//			out.close();
			socket.close();
			serverSocket.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}

