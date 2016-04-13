package com.tare.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	protected MyRemoteImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main (String[] args) {
		try {
			MyRemote service = new MyRemoteImpl(); 
			Naming.rebind("RemoteHello", service);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
