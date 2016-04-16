package com.tare.serialization.socket;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;

public class JabberClient {

	static final int port = 8080; 
	
	
	public JabberClient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String args[]) {
		MyObject o; 
		try {
			
			InetAddress addr = InetAddress.getByName(null); 
			System.out.println("addr = " + addr);
			@SuppressWarnings("resource")
			Socket socket = new Socket(addr, port); 
			System.out.println("socket = " + socket);
			ObjectInputStream fromServer = new ObjectInputStream(socket.getInputStream());
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			
			int i = 0; 
			while(true) {
				o = (MyObject)fromServer.readObject(); 
				System.out.println("trying to send acknowledgement...");
				Thread.sleep(500);
				toServer.writeInt(i++);
				System.out.println("succeeded");
				System.out.println(o);
				
				
			}
			
			
		} catch (EOFException f) {
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	

}
