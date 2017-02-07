package cn.com.DIH;

class Demo {
	int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		int[] arr = new int[a];
		System.out.println(arr[2]);// 制造第一处

		return a / b; // 制造第二处
	}
}

public class ManyCatch {
	public static void main(String[] args) {
		Demo a = new Demo();

		try {
			int d = a.div(4, 1);
			System.out.println("afjkafh: "+ d);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}finally {
			//ava 中的 Finally 关键一般与try一起使用，在程序进入try块之后，
			//无论程序是因为异常而中止或其它方式返回终止的，finally块的内容一定会被执行 。
			System.err.println("都已执行完毕");
		}
		System.out.println("over:");
	}
}
