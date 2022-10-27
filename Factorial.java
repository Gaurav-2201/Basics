import java.util.*;
class Factorial
{
	public static int Fact(int n)
	{
		int ans = 1;
		for(int i = 1; i<=n; i++)
		{
			ans*=i;
		}
		return ans;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.print(Fact(n));
		sc.close();
	}
}