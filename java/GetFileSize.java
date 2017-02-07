package cn.com.NetSocket;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetFileSize {
	public static void main(String[] args) throws IOException {
		int size = 0;
		URL url = new URL("http://note.youdao.com/noteshare?id=86ca0c532e215172efb6b5020b5052c7&sub=02137495CAAA44E7AC2D7529BECABF44");
		URLConnection conon = url.openConnection();
		size = conon.getContentLength();
		if (size < 0) {
			System.out.println("无法获取文件大小");
		}
		else
		{
			System.out.println("文件大小：" + size);
		}
		conon.getInputStream().close();
	}
}
