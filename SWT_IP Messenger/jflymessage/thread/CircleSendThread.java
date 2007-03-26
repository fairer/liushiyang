package jflymessage.thread;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import jflymessage.common.Define;

public class CircleSendThread extends Thread{
	private byte[] buffer ;
	private int clientPort ;
	private int serverPort ;
	
	public CircleSendThread(byte[] buffer,int serverPort,int clientPort){
		this.buffer = buffer;
		this.clientPort = clientPort;
		this.serverPort =serverPort;
	}
	
	public void run() {
		
		try {
			byte[] localhost = InetAddress.getLocalHost().getAddress();
			DatagramSocket ds = new DatagramSocket(serverPort);
			for(int i = 1; i<=255;i++){
				
				localhost[3] = (byte)i;
//				System.out.println("============"+InetAddress.getByAddress(localhost));
				DatagramPacket p = new DatagramPacket(buffer,buffer.length,InetAddress.getByAddress(localhost),clientPort);
				ds.send(p);
				Thread.sleep(5);
			}
			ds.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
