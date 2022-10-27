class Immutable
{
	public static void Check(Object a, Object b)
	{
		if(a == b)
			System.out.println("Both referencing to same variable");
		else
			System.out.println("Both referencing to different variable");
	}
	public static void main(String[] args)
	{
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.print("Before modification: ");
		Check(s1, s2);
		s1+="ell";
		System.out.print("After modification: ");
		Check(s1, s2);
	}
}