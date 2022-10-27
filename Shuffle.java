import java.util.*;
class Shuffle
{
	public static ArrayList<Integer> Shufflee(ArrayList<Integer> arr, int n)
	{
		Collections.shuffle(arr);
		return arr;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i<n; i++)
			arr.add(sc.nextInt());
		System.out.print(Shufflee(arr, n));
		sc.close();
	}
}