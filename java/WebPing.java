package cn.com.NetSocket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class WebPing {
	public static void main(String[] args) throws UnknownHostException, IOException {
	 InetAddress addr;
	 Socket socket = new Socket("www.baidu.com", 80);
	 addr = socket.getInetAddress();
	 System.out.println(addr);
	}
}
