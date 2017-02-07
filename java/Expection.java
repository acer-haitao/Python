package cn.com.DIH;

public class Expection {
	public static void main(String[] args) {
		try {
			throw new Exception("My Expection");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Caught Exception");
			System.err.println("getMsg " + e.getMessage());
			System.err.println("getLocalizedMessage " + e.getLocalizedMessage());
			System.err.println("e " + e);
			e.printStackTrace();
		}
	}
}
