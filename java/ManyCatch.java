package cn.com.DIH;

class Demo {
	int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		int[] arr = new int[a];
		System.out.println(arr[2]);// �����һ��

		return a / b; // ����ڶ���
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
			//ava �е� Finally �ؼ�һ����tryһ��ʹ�ã��ڳ������try��֮��
			//���۳�������Ϊ�쳣����ֹ��������ʽ������ֹ�ģ�finally�������һ���ᱻִ�� ��
			System.err.println("����ִ�����");
		}
		System.out.println("over:");
	}
}
