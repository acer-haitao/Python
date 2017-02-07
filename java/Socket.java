package cn.com.NetSocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;

import org.omg.CORBA.portable.UnknownException;

public class Socket {
	public static void main(String[] args) {
		// client s = new client();
		// s.start();
		try {
			// 1 创建套接字
			ServerSocket skt = new ServerSocket(8888);
			System.out.println("1创建套接字");
			System.out.println("正在启动服务器......");
			// 2 建立接收客户端连接
			java.net.Socket s1 = skt.accept();
			System.out.println("2等待连接");
			System.out.println("" + s1.getInetAddress().getLocalHost() + ":" + s1.getLocalPort() + "已连接");
			// 3建立IO输入流读取客户端发送过来的信息
			

			
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s1.getOutputStream()));
            out.write("我是服务器");
            out.flush();
            System.out.println("3发送信息");
      
			BufferedReader in = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			// 4读取客户端发送过来的信息
			String buf = in.readLine();
			System.out.println("client says:" + buf);
			System.out.println("4读取信息");
        
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

/*
class ClientTest extends Thread {

	public void run() {
		try {
			// 1 创建套接字
			java.net.Socket s = new java.net.Socket("127.0.0.1", 8888);

			// 2 构建输出流向服务器发送数据
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			// 3 向服务器发送数据
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			bw.write("我是客户端");
			bw.flush();
			// 4 接收服务信息
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String msg = br.readLine();
			System.out.println("Server Says:" + msg);

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
*/
