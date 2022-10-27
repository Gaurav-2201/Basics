import java.util.*;
class CharacterLambda
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		System.out.print("Enter the number of records: ");
		int n = sc.nextInt();
		System.out.print("Enter the records: ");
		for(int i = 0; i<n; i++)
		{
			String a = sc.next();
			String b = sc.next();
			map.put(a, b);
		}
		//HashMap<String, String> ans = new HashMap<String, String>();
		map.forEach((key, value) -> System.out.println(key.toUpperCase()+" :"+value.toUpperCase()));
		sc.close();
		//System.out.print(ans);
	}
}