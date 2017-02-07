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
			// 1 �����׽���
			java.net.Socket s = new java.net.Socket("127.0.0.1", 8888);
			System.out.println("1�����׽���");
			
			// 2 ������������������������
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			System.out.println("2�������������");
			// 3 ���������������
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			bw.write("���ǿͻ���");
			bw.flush();
			System.out.println("3���������������");
			
			// 4 ���շ�����Ϣ
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String msg = br.readLine();
			System.out.println("Server Says:" + msg);
			System.out.println("4���շ�������Ϣ");

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
