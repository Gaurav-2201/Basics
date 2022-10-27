import java.util.*;
class Swap
{
	public static void Swapp(int a, int b)
	{
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.print(a+" "+b);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The numbers are: ");
		Swapp(a,b);
		sc.close();
	}
}