package cn.com.NetSocket;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class UsedPort {
	public static void main(String[] args) throws UnknownHostException {
		Socket sockt;
		String host = "localhost";
		if (args.length > 0) {
			host = args[0];
		}
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr.getHostName() + ":"+addr.getHostAddress());
		for (int i = 0; i < 1024; i++) {
			try {
				System.out.println("�鿴" + i + ":");
				sockt = new Socket(host, i);
				System.out.println("�˿�" + i + "�ѱ�ʹ��");
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	}
	
}
