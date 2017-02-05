package cn.com.DIH;

import java.io.File;
import java.io.FilenameFilter;

public class FindFile {
	public static void main(String[] args) {
		File dir = new File("D:/java-share/Test/src/cn/com/DIH");
		//ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ��
		FilenameFilter filefilter = new FilenameFilter() {
			//��������
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith("java");//����Ŀ¼��������java��β���ļ�
			}
		};
		
		String[] children = dir.list(filefilter);
		
		if (children == null) {
			System.out.println("Ŀ¼������");
		} else {
			for (int i = 0; i < children.length; i++) {
				System.out.println(children[i]);
			}
		}
		
		System.out.println("ϵͳ��Ŀ¼�� ");
		File[] roots = File.listRoots();
		for (int i = 0; i < roots.length; i++) {
			System.out.println(roots[i]);
		}
		System.out.println("ϵͳ��ǰ����Ŀ¼��"+System.getProperty("user.dir"));
		
		//����Ŀ¼
		System.out.println("����Ŀ¼");
		File dir1 = new File("D:/java-share");
		vistAllFileDir(dir1);
	}
	
	public static void vistAllFileDir( File dir)
	{
		System.out.println(dir);
		if (dir.isDirectory()) {
			String[] children = dir.list();//��ȡĿ¼��
			for (int i = 0; i < children.length; i++) {
				vistAllFileDir(new File(dir, children[i]));
				//���� parent ·�����ַ����� child ·�����ַ�������һ���� File ʵ����
			}
		}
	}
}
