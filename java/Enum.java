package cn.com.DIH;

enum Car {
	a, b, c, d, e, f
}

enum NewCar
{
	a(900),b(100),c(1090);
	private int price;
	NewCar(int p)
	{
		price = p;
	}
	int getPrice()
	{
		return price;
	}
}
public class Enum {
	public static void main(String[] args) {
		Car c;
		c = Car.c;
		switch (c) {
		case a:
			System.out.println("you choose a");
			break;
		case b:
			System.out.println("you choose b");
			break;
		case c:
			System.out.println("you choose c");
			break;
		case d:
			System.out.println("you choose d");
			break;
		default:
			System.out.println("i don't know");
			break;
		}
		
		System.out.println("所有汽车价格：");
		for (NewCar C : NewCar.values()) {
			System.out.println(c + "需要"+ C.getPrice() + "美元");
		}
	}
}
