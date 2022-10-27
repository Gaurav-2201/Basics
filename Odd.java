import java.util.*;
class Odd
{
	public static boolean Odds(int[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]%2 == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		System.out.print("Enter the elements: ");
		int[] arr = new int[n];
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print(Odds(arr));
		sc.close();
	}
}