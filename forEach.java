import java.util.*;
class forEach
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.print("Enter the elements: ");
		for(int i = 0; i<n; i++)
		{
			arr.add(sc.nextInt());
		}
		for(int a: arr)
		{
			System.out.print(a+" ");
		}
		sc.close();
	}
}