interface Interface1
{
	static void hello()
	{
		System.out.println("Inside Static method");
	}
	void overrideMethod(String str);
}
class Static_Interface implements Interface1
{
	public static void main(String[] args)
	{
		Static_Interface demo = new Static_Interface();
		Interface1.hello();
		demo.overrideMethod("This is Override Method");
	}
	@Override
	public void overrideMethod(String str)
	{
		System.out.println(str);
	}
}