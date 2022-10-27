import java.util.*;
class Second_largest
{
	public static int Second(int[] arr, int n)
	{
		Arrays.sort(arr);
		return arr[1];
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
		System.out.print(Second(arr, n));
		sc.close();
	}
}