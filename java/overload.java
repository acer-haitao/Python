package cn.com.DIH;

class overload {
	int high;

	overload() {
		System.out.println("无参构造函数");
		high = 4;
	}

	overload(int i) {
		System.out.println("有参构造函数");
		high = i;
	}

	void fun() {
		System.out.println("房子的高度：" + high);
	}

	void fun(String s) {
		System.out.println(s + "房子的高度：" + high);
	}

	public static long fb(long num) // 斐波那契额
	{
		if ((num == 0) || (num == 1)) {
			return num;
		} else {
			return fb(num - 1) + fb(num - 2);
		}

	}

	// 阶乘
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
		t.fun("方法重载");
		new overload();

		for (int i = 0; i <= 10; i++) {
			System.out.printf("Fd of %d is %d\n", i, fb(i));
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d! = %d\n",i,factorial(i));
		}
	}
}
