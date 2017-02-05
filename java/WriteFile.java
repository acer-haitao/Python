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
			//文件写入
			BufferedWriter out = new BufferedWriter(new FileWriter("test.txt"));//new FileWriter创建文件
			out.write("hello world\n");
			out.write("Good Good");
			out.close();
			System.out.println("创建文件成功");
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		try {
			//文件读写
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
			//文件删除
			File file = new File("delete.txt");
			if (file.delete()) {
				System.out.println(file.getName() + "  文件已删除");
			} else {
				System.out.println("文件删除失败");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			//将文件内容复制到另外一个文件
			InputStream fileIn = new FileInputStream(new File("test.txt"));//通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定
			OutputStream fileOut = new FileOutputStream(new File("descopy.txt"));
			byte[] buf = new byte[1024];
			int len;
			while((len = fileIn.read(buf)) > 0)
			{
				fileOut.write(buf, 0, len);
			}
			fileOut.close();
			fileIn.close();
			System.out.println("拷贝完成");
			//拷贝完成后再从文件中读取出来
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
