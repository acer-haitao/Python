package cn.com.DIH;

public class Main {

	public static void main(String[] args) {
		String str = "This is java";
		System.out.println(removechar(str, 2));
	}
	public static String removechar(String str, int pos) {
		return str.substring(0, pos) + str.substring(pos+1);
	}
}
