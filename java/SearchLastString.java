package cn.com.DIH;

public class SearchLastString {

	public static void main(String[] args) {
		String str = "Hello world, Hello 2017";
		int index = str.lastIndexOf("Hello");
		if (index == -1) {
			System.out.println("û���ҵ��ַ���");
		} else {
			System.out.println("index :" + index);
		}
	}
}
