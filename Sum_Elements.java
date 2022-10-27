import java.util.*;
class Sum_Elements
{
	public static int Sum(int[] arr, int n)
	{
		int sum = 0;
		for(int i = 0; i<n; i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print(Sum(arr, n));
		sc.close();
	}
}