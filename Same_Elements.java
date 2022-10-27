import java.util.*;
class Same_Elements
{
	public static boolean Same(int[] arr1, int[] arr2, int n, int m)
	{
		if(n!=m) return false;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i = 0; i<m; i++)
		{
			if(arr1[i]!=arr2[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements for both arrays: " );
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		for(int i = 0; i<n; i++)
		{
			arr1[i] = sc.nextInt();
		}
		for(int j = 0; j<m; j++)
		{
			arr2[j] = sc.nextInt();
		}
		if(Same(arr1, arr2, n, m))
			System.out.println("Same");
		else
			System.out.println("Not Same");
		sc.close();
	}
}