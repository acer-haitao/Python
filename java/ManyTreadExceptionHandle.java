package cn.com.DIH;


class ManyThread extends Thread
{
	public void run()
	{
		System.out.println("Throw in");
		throw new RuntimeException();
	}
}

public class ManyTreadExceptionHandle {
	public static void main(String[] args) {
		ManyThread t = new ManyThread();
		t.start();
	
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
		System.out.println("Main exit");
	}
}
