import java.util.*;
class Employee
{
	void name1()
	{
		System.out.println("Jack");
	}
	void empid()
	{
		System.out.println("100");
		
	}
}
class Student extends Employee
{
	void name2()
	{
		System.out.println("Sparrow");
	}
	void stuid()
	{
		System.out.println("102");
	}
	
}
class Doctor extends Student
{
	void name3()
	{
		System.out.println("Vijay");
	}
	void docid()
	{
		System.out.println("104");
	}
	
}
class Main
{
	public static void main(String args[])
	{
		Doctor d=new Doctor();
		d.name3();
		d.name2();
		d.name1();
		d.docid();
		d.stuid();
		d.empid();
	}
}
