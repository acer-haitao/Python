package cn.com.DIH;

class overload {
	int high;

	overload() {
		System.out.println("�޲ι��캯��");
		high = 4;
	}

	overload(int i) {
		System.out.println("�вι��캯��");
		high = i;
	}

	void fun() {
		System.out.println("���ӵĸ߶ȣ�" + high);
	}

	void fun(String s) {
		System.out.println(s + "���ӵĸ߶ȣ�" + high);
	}

	public static long fb(long num) // 쳲�������
	{
		if ((num == 0) || (num == 1)) {
			return num;
		} else {
			return fb(num - 1) + fb(num - 2);
		}

	}

	// �׳�
	public static long factorial(long Num) {
		if (Num <= 1) {
			return 1;
		} else {
			return Num * factorial(Num - 1);
		}
	}

	public static void main(String[] args) {
		overload t = new overload(3);
		t.fun();
		t.fun("��������");
		new overload();

		for (int i = 0; i <= 10; i++) {
			System.out.printf("Fd of %d is %d\n", i, fb(i));
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d! = %d\n",i,factorial(i));
		}
	}
}
