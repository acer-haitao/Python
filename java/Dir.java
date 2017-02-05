package cn.com.DIH;

import java.io.File;
import java.io.IOException;

public class Dir {
	public static void main(String[] args) throws IOException {
		showDir(1, new File("D:\\java-share"));
	}
	//ÏÔÊ¾Ä¿Â¼
	public static void showDir(int index, File file) throws IOException
	{
		for (int i = 0; i < index; i++) {
			System.out.print("-");
		}
		System.out.println(file.getName());
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				showDir(index + 4, files[i]);
			}
		} 
	}
}
