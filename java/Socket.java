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
			// 1 �����׽���
			ServerSocket skt = new ServerSocket(8888);
			System.out.println("1�����׽���");
			System.out.println("��������������......");
			// 2 �������տͻ�������
			java.net.Socket s1 = skt.accept();
			System.out.println("2�ȴ�����");
			System.out.println("" + s1.getInetAddress().getLocalHost() + ":" + s1.getLocalPort() + "������");
			// 3����IO��������ȡ�ͻ��˷��͹�������Ϣ
			

			
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s1.getOutputStream()));
            out.write("���Ƿ�����");
            out.flush();
            System.out.println("3������Ϣ");
      
			BufferedReader in = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			// 4��ȡ�ͻ��˷��͹�������Ϣ
			String buf = in.readLine();
			System.out.println("client says:" + buf);
			System.out.println("4��ȡ��Ϣ");
        
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
			// 1 �����׽���
			java.net.Socket s = new java.net.Socket("127.0.0.1", 8888);

			// 2 ������������������������
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			// 3 ���������������
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			bw.write("���ǿͻ���");
			bw.flush();
			// 4 ���շ�����Ϣ
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
