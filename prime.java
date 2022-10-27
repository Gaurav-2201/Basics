import java.util.*;
class prime
{
	public static boolean Prime(int n)
	{
		int count = 1;
		for(int i = 2; i<n; i++)
		{
			if(n%i == 0)
				count++;
		}
		if(count>2)
			return false;
		else
			return true;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		System.out.print(Prime(n));
		sc.close();
	}
}