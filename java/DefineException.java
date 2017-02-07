package cn.com.DIH;

class WrongException extends Exception {
	public WrongException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}

class Input {
	void input() throws WrongException {
		throw new WrongException("Wrong input");
	}
}

public class DefineException {
	public static void main(String[] args) {
		try {
			new Input().input();
		} catch (WrongException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println(e);
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.toString());
			System.out.println(e.getCause());
		}
	}
}
