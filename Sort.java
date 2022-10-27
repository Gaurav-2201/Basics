import java.util.*;
class Sort
{
	public static int[] Sorted(int[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i; j<arr.length; j++)
			{
				if(arr[j]<arr[i])
				{
					arr[i] = arr[i] ^ arr[j];
					arr[j] = arr[i] ^ arr[j];
					arr[i] = arr[i] ^ arr[j];
				}	
			}
		}
		return arr;
		
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
		arr = Sorted(arr);
		for(int i = 0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}