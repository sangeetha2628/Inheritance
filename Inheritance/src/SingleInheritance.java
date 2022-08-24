import java.util.*;
class A
{
	int add(int a,int b)
	{
		return a+b;
	}
	int sub(int a,int b)
	{
		return a-b;
	}
}
class B extends A
{
	int incre(int a)
	{
		return a+1;
	}
	public static void main(String args[])
	{
		B b=new B();
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int d=sc.nextInt();
		System.out.println(b.add(c,d));

		System.out.println(b.sub(c,d));
		System.out.println(b.incre(d));
		
	}
}