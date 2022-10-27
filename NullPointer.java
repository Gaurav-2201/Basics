class NullPointer
{
	public static void main(String[] args)
	{
		String s = null;
		try
		{
			if(s.equals("Netenrich"))
				System.out.println("Found");
			else
				System.out.println("Not Found");
		}
		catch(NullPointerException e)
		{
			System.out.println("null pointer exception caught");
		}
	}
}