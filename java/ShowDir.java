package cn.com.DIH;

import java.io.*;


import javax.swing.filechooser.FileFilter;

public class ShowDir {
	public static void main(String[] args) {
		File dir = new File("D:/java-share");
		File[] files = dir.listFiles();
		String[] children = dir.list();
		
		FileFilter fileFilter = new FileFilter() {
			
			@Override
			public boolean accept(File f) {
				// TODO Auto-generated method stub
				return f.isDirectory();
			}

			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		files = dir.listFiles();
		System.out.println(files.length);
		
		if (files.length == 0) {
			System.out.println("Ŀ¼�����ڻ���������һ��Ŀ¼");
		} else {
			for (int i = 0; i < files.length; i++) {
				File filename = files[i];
				System.out.println(filename.toString());
			}
			System.out.println("��ӡ�ļ�����");
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
		
	}
	
}
