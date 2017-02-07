package cn.com.NetSocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URL;

public class GetHtml {
	public static void main(String[] args) throws Exception{
		URL url = new URL("http://www.runoob.com/java/java-examples.html");
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		BufferedWriter writer = new BufferedWriter(new FileWriter("data.html"));
		String line;

		while((line = reader.readLine()) != null)
		{
			System.out.println(line);
			writer.write(line);
			writer.newLine();
		}
		
		/*
		while((line = reader.readLine()) != null)
		{
			System.out.println(line);
			writer.write(line);
		}
		*/
		reader.close();
		writer.close();
	}
}
