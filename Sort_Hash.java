import java.util.*;
import java.util.Map.Entry;
class Sort_Hash
{
	public static LinkedHashMap<String, Integer> Sort(HashMap<String, Integer> map)
	{
		LinkedHashMap<String, Integer> ans = new LinkedHashMap<String, Integer>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			arr.add(entry.getValue());
		}
		Collections.sort(arr);
		for(int num:arr)
		{
			for(Entry<String, Integer> entry : map.entrySet())
			{
				if(entry.getValue().equals(num))
				{
					ans.put(entry.getKey(), num);
				}
			}
		}
		return ans;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		System.out.print("Enter the number of records: ");
		int n = sc.nextInt();
		System.out.print("Enter the records: ");
		for(int i = 0; i<n; i++)
		{
			String a = sc.next();
			Integer b = sc.nextInt();
			map.put(a, b);
		}
		LinkedHashMap<String, Integer> ans = Sort(map);
		System.out.println(ans);
		sc.close();
	}
}

