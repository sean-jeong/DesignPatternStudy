package com.tare.serialization.socket;

import java.io.DataInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class JabberServer {

	static final int port = 8080; 
	
	
	public JabberServer() {
	}

	public static void main(String[] args) {
		try {
			MyObject o = new MyObject(); 
			ServerSocket s = new ServerSocket(port); 
			System.out.println("Sever Started" + s);
			
			Socket socket = s.accept(); 
			System.out.println("Connection accepted, socket: " + socket);
			ObjectOutputStream toClient = new ObjectOutputStream(socket.getOutputStream());
			DataInputStream fromClient = new DataInputStream(socket.getInputStream());
			
			while (o.count < 11) {
				System.out.println("writing "+ o );
				o.setName();
				
				toClient.reset();
				toClient.writeObject(o);
				System.out.print("trying to received acknowledgement...");
				System.out.println("acknowledgement: " + fromClient.readInt());
				System.out.println("succeeded");
			}
			System.out.println("closing...");
			toClient.close();
			socket.close();
			s.close();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
