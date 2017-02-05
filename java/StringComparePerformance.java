package cn.com.DIH;

public class StringComparePerformance {
	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();
		for (int i = 0; i < 500000; i++) {
			String str1 = "Hello";
		}
		long endtime = System.currentTimeMillis();
		System.out.println("str1ºÄÊ±£º" + (endtime - starttime));
		
		long starttime1 = System.currentTimeMillis();
		for (int i = 0; i < 500000; i++) {
			String str2 = new String("Hello");
		}
		long endtime1 = System.currentTimeMillis();
		System.out.println("str2ºÄÊ±£º" + (endtime1 - starttime1));
	}
}
