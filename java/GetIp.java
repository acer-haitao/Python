package cn.com.NetSocket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.UnexpectedException;

import org.omg.CORBA.portable.UnknownException;

public class GetIp {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = null;
		try {
			address = InetAddress.getByName("www.baidu.com");
		} catch (UnknownException e) {
			// TODO: handle exception
			System.exit(2);
		}
		System.out.println(address.getHostAddress() + ":"+address.getHostName());
		System.exit(0);
	}
}
