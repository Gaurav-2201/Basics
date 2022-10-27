import java.util.*;
class MergeLists
{
	public static ArrayList<Integer> Merge(ArrayList<Integer> arr1, ArrayList<Integer> arr2)
	{
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		arr3.addAll(arr1);
		arr3.addAll(arr2);
		return arr3;
		
	}
	public static void main(String[] arsg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in both lists: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.print("Enter the elements of both lists one by one: ");
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for(int i = 0; i<n; i++)
		{
			arr1.add(sc.nextInt());
		}
		for(int j = 0; j<m; j++)
		{
			arr2.add(sc.nextInt());
		}
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		arr3 = Merge(arr1, arr2);
		System.out.print(arr3);
		sc.close();
	}
}