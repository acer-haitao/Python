package cn.com.DIH;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;


public class AddToFile {

	private static final String FileUtils = null;

	public static void main(String[] args) throws Exception {
		try {
			// �ļ�׷������
			BufferedWriter out = new BufferedWriter(new FileWriter("filename"));
			out.write("2017-2-5\n");
			out.close();

			out = new BufferedWriter(new FileWriter("filename", true));// ׷��
			out.write("2017-2-6");
			out.close();

			BufferedReader in = new BufferedReader(new FileReader("filename"));
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
			in.close();

		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("IOException:" + e);
		}

		try {
			// ������ʱ�ļ�
			File tmpFile = File.createTempFile("tmpfile", ".jiosn");
			tmpFile.deleteOnExit();// ���������ֹʱ������ɾ���˳���·������ʾ���ļ���Ŀ¼��
			BufferedWriter out = new BufferedWriter(new FileWriter("tmpFile"));
			out.write("hello world !");
			out.close();

			BufferedReader in = new BufferedReader(new FileReader("tmpFile"));
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
			System.out.println("��ʱ�ļ������ɹ���");
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			// ��ȡ�ļ���С
			long size = 0;
			size = FileSize("filename");
			System.out.println("�ļ���СΪ��" + size);

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			// ��ָ��Ŀ¼�ڴ����ļ�
			File file = null;
			File dir = new File("D:/");
			file = File.createTempFile("javatmp", ".java", dir);
			System.out.println(file.getPath() + "---" + file.canRead() + "--�޸�ʱ�䣺" + (new Date(file.lastModified())));
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			// �����ļ�
			File file = new File("D:/test.txt");
			if (file.createNewFile()) {
				System.out.println("�����ļ��ɹ�");
			} else {
				System.out.println("�����ˣ��ļ��Ѵ���");
			}

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			//�ݹ鴴��Ŀ¼
			String dir = "D:\\a\\b\\c\\d\\e\\f\\g";
			File file = new File(dir);
			Boolean flag = file.mkdirs();
			if (flag) {
				System.out.println("�����ɹ�");
			} else {
				System.out.println("����ʧ��");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			//ɾ��Ŀ¼
			DeleteDir(new File("D:/a"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	//�ж��ļ��Ƿ���ں��ļ���С
	public static long FileSize(String Filename) {
		File file = new File(Filename);
		if (!file.exists() || !file.isFile()) {
			System.out.println("�ļ�������");
			return -1;
		}
		return file.length();
	}
	
	//ɾ��Ŀ¼
	public static boolean DeleteDir(File dir)
	{
		if (dir.isDirectory()) {
			String[] children = dir.list();//����һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��
			if (children.length < 0) {
				System.out.println("Ŀ¼Ϊ�գ�" + children.length);
			}
			else
			{
				for(int i = 0; i < children.length; i++)
				{
					System.out.println(children[i]);
				}
			}
			for (int i = 0; i < children.length; i++) {
				boolean sucess = DeleteDir(new File(dir, children[i]));
				if (!sucess) {
					return false;
				} 
			}
		}
		if (dir.delete()) {
			System.out.println("Ŀ¼��ɾ��");
			return true;
		} else {
			System.out.println("Ŀ¼ɾ��ʧ��");
			return false;
		}	
	}
}
