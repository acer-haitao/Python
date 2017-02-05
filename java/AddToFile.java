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
			// 文件追加内容
			BufferedWriter out = new BufferedWriter(new FileWriter("filename"));
			out.write("2017-2-5\n");
			out.close();

			out = new BufferedWriter(new FileWriter("filename", true));// 追加
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
			// 创建临时文件
			File tmpFile = File.createTempFile("tmpfile", ".jiosn");
			tmpFile.deleteOnExit();// 在虚拟机终止时，请求删除此抽象路径名表示的文件或目录。
			BufferedWriter out = new BufferedWriter(new FileWriter("tmpFile"));
			out.write("hello world !");
			out.close();

			BufferedReader in = new BufferedReader(new FileReader("tmpFile"));
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
			System.out.println("临时文件创建成功！");
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			// 获取文件大小
			long size = 0;
			size = FileSize("filename");
			System.out.println("文件大小为：" + size);

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			// 在指定目录内创建文件
			File file = null;
			File dir = new File("D:/");
			file = File.createTempFile("javatmp", ".java", dir);
			System.out.println(file.getPath() + "---" + file.canRead() + "--修改时间：" + (new Date(file.lastModified())));
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			// 创建文件
			File file = new File("D:/test.txt");
			if (file.createNewFile()) {
				System.out.println("创建文件成功");
			} else {
				System.out.println("出错了，文件已存在");
			}

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			//递归创建目录
			String dir = "D:\\a\\b\\c\\d\\e\\f\\g";
			File file = new File(dir);
			Boolean flag = file.mkdirs();
			if (flag) {
				System.out.println("创建成功");
			} else {
				System.out.println("创建失败");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			//删除目录
			DeleteDir(new File("D:/a"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	//判断文件是否存在和文件大小
	public static long FileSize(String Filename) {
		File file = new File(Filename);
		if (!file.exists() || !file.isFile()) {
			System.out.println("文件不存在");
			return -1;
		}
		return file.length();
	}
	
	//删除目录
	public static boolean DeleteDir(File dir)
	{
		if (dir.isDirectory()) {
			String[] children = dir.list();//返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
			if (children.length < 0) {
				System.out.println("目录为空：" + children.length);
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
			System.out.println("目录已删除");
			return true;
		} else {
			System.out.println("目录删除失败");
			return false;
		}	
	}
}
