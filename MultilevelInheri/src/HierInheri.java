import java.util.*;
class Car
{
	void speed()
	{
		System.out.println("100/hr");
	}
}
class Audi extends Car
{
	void color()
	{
		System.out.println("Black");
	}
}
class Duster extends Car
{
	void brand()
	{
		System.out.println("Duster");
	}

}
class Inheritance
{
	public static void main(String args[])
	{
		Duster d=new Duster();
		Audi a=new Audi();
		d.brand();
		a.color();
		d.speed();
		a.speed();
	}
}