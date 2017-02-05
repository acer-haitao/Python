package cn.com.DIH;

public class Equal {
	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "Hello world";
		
		boolean match1 = str1.regionMatches(7, str2, 7, 6);
		System.out.println(match1);
	}
}
