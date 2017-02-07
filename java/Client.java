package cn.com.NetSocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.omg.CORBA.portable.UnknownException;

public class Client {
	public static void main(String[] args) {
		try {
			// 1 创建套接字
			java.net.Socket s = new java.net.Socket("127.0.0.1", 8888);
			System.out.println("1创建套接字");
			
			// 2 构建输出流向服务器发送数据
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			System.out.println("2构建输入输出流");
			// 3 向服务器发送数据
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			bw.write("我是客户端");
			bw.flush();
			System.out.println("3向服务器发送数据");
			
			// 4 接收服务信息
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String msg = br.readLine();
			System.out.println("Server Says:" + msg);
			System.out.println("4接收服务器信息");

		} catch (UnknownException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
