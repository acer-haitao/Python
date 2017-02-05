package cn.com.DIH;

public class OverWrite {

	public static void main(String[] args) {
		Figure f = new Figure(10, 10);
		ReFigure r = new ReFigure(100, 100);
		System.out.println(f.area());
		System.out.println(r.area());
	}
}
class Figure{
	double d1;
	double d2;
	Figure(double a, double b)
	{
		System.out.println("有参构造函数1");
		d1 = a;
		d2 = b;
	}
	Double area()
	{
		System.out.println("inside of arear");
		return (d1 * d2);
	}	
}

class ReFigure extends Figure 
{
	ReFigure(double a, double b)
	{
		super(a, b);
	}
	Double area()
	{
		System.out.println("reinside of area");
		return (d1 * d2);
	}
}