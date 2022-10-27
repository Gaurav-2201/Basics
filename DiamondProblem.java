interface Diamond1
{
	public default void display()
	{
		System.out.println("Diamond1 method invoked");
	}
}
interface Diamond2
{
	public default void display()
	{
		System.out.println("Diamond2 method invoked");
	}
} 
class DiamondProblem implements Diamond1, Diamond2
{
	public void display()
	{
		Diamond1.super.display();
		Diamond2.super.display();
	}
	public static void main(String[] args)
	{
		DiamondProblem obj = new DiamondProblem();
		obj.display();
	}
}