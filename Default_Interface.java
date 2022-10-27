interface Interface2
{
	public void square(int a);
	default void show()
	{
		System.out.println("Default Method executed");
	}
}
class Default_Interface implements Interface2
{
	public void square(int a)
	{
		System.out.println(a*a);
	}
	public static void main(String[] args)
	{
		Default_Interface d = new Default_Interface();
		d.square(4);
		d.show();
	}
}