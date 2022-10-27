import java.util.*;
class Lambda_Update
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		System.out.print("Enter the elements: ");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i<n; i++)
		{
			arr.add(sc.nextInt());
		}
		sc.close();
		System.out.print("After updating: ");
		arr.forEach((a)->{System.out.println(a+10);});
	}
}