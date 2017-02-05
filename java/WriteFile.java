package cn.com.DIH;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteFile {
	public static void main(String[] args) throws IOException {
		try {
			//�ļ�д��
			BufferedWriter out = new BufferedWriter(new FileWriter("test.txt"));//new FileWriter�����ļ�
			out.write("hello world\n");
			out.write("Good Good");
			out.close();
			System.out.println("�����ļ��ɹ�");
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		try {
			//�ļ���д
			BufferedReader in = new BufferedReader(new FileReader("test.txt"));
			String str;
			while((str = in.readLine())!= null)
			{
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			//�ļ�ɾ��
			File file = new File("delete.txt");
			if (file.delete()) {
				System.out.println(file.getName() + "  �ļ���ɾ��");
			} else {
				System.out.println("�ļ�ɾ��ʧ��");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			//���ļ����ݸ��Ƶ�����һ���ļ�
			InputStream fileIn = new FileInputStream(new File("test.txt"));//ͨ����һ����ʵ���ļ�������������һ�� FileInputStream�����ļ�ͨ���ļ�ϵͳ�е� File ���� file ָ��
			OutputStream fileOut = new FileOutputStream(new File("descopy.txt"));
			byte[] buf = new byte[1024];
			int len;
			while((len = fileIn.read(buf)) > 0)
			{
				fileOut.write(buf, 0, len);
			}
			fileOut.close();
			fileIn.close();
			System.out.println("�������");
			//������ɺ��ٴ��ļ��ж�ȡ����
			BufferedReader in1 = new BufferedReader(new FileReader("descopy.txt"));
			String str;
			while((str = in1.readLine()) != null)
			{
				System.out.println(str);
			}
			in1.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
