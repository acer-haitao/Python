package cn.com.DIH;

import java.io.File;
import java.io.FilenameFilter;

public class FindFile {
	public static void main(String[] args) {
		File dir = new File("D:/java-share/Test/src/cn/com/DIH");
		//通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例
		FilenameFilter filefilter = new FilenameFilter() {
			//条件过滤
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith("java");//查找目录下所有以java结尾的文件
			}
		};
		
		String[] children = dir.list(filefilter);
		
		if (children == null) {
			System.out.println("目录不存在");
		} else {
			for (int i = 0; i < children.length; i++) {
				System.out.println(children[i]);
			}
		}
		
		System.out.println("系统根目录： ");
		File[] roots = File.listRoots();
		for (int i = 0; i < roots.length; i++) {
			System.out.println(roots[i]);
		}
		System.out.println("系统当前工作目录："+System.getProperty("user.dir"));
		
		//遍历目录
		System.out.println("遍历目录");
		File dir1 = new File("D:/java-share");
		vistAllFileDir(dir1);
	}
	
	public static void vistAllFileDir( File dir)
	{
		System.out.println(dir);
		if (dir.isDirectory()) {
			String[] children = dir.list();//获取目录名
			for (int i = 0; i < children.length; i++) {
				vistAllFileDir(new File(dir, children[i]));
				//根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
			}
		}
	}
}
