import java.util.*;
class Fibonacci
{
	public static int fibo(int n)
	{
		if(n<=1)
			return n;
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.print(fibo(n));
		sc.close();
	}
}