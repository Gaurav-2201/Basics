class A
{
	void fun()
	{
		System.out.println("Fun A class");
	}
	void work()
	{
		System.out.println("Work A Class");
	}
}
class B extends A
{
	void rest()
	{
		System.out.println("B Class rest");
	}
}
class Inheritance
{
	public static void main(String[] args)
	{
		B b = new B();
		b.rest();
		b.work();
	}
	
}