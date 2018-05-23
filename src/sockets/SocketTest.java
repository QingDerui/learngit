package sockets;

import java.net.ServerSocket;

public class SocketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SocketServer server1 = new SocketServer();
		
		 ClientSocket client1 = new ClientSocket();
		 server1.setOnServer();	 
	     client1.getFeedBack();
	    System.err.println("Finish");
	}

}
