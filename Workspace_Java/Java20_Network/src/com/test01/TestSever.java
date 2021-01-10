package com.test01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TestSever {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket(8888);
		System.out.println("서버입니다.");
		
		byte[] buff = new byte [1024];
		
		DatagramPacket recieveP = new DatagramPacket(buff, buff.length);
		
		ds.receive(recieveP);
		
		System.out.println(new String(recieveP.getData()));
		
		ds.close();
		ds.disconnect();
	}
}
