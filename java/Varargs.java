package cn.com.DIH;

public class Varargs {
	public static void main(String[] args) {
		int sum = 0;
		sum = sumvargs(new int[] {1,2,3,4,5,6,7,8,9,10});
		System.out.println(sum);
		
		Test(1,3,4,5);
		Test("Hello World", 1,2,4,5);
	}
	static int sumvargs(int ... intArray)
	{
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		return sum;
	}
	
	static void Test(int ... Num)
	{
		System.out.println("参数的个数" + Num.length);
		for (int i : Num) {
			System.out.println(i);
		}
	}
	static void Test(String msg, int ... Num)
	{
		System.out.println("参数的个数" + Num.length +" "+ msg);
		for (int i : Num) {
			System.out.println(i);
		}
	}
}
