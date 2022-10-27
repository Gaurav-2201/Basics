import java.util.*;
class DistinctChars
{
	public static void Distinct(String s)
	{
		int[] count = new int[256];
		int no = 0;
		int i;
		for(i = 0; i<s.length(); i++)
		{
			if(s.charAt(i)!=' ')
				count[(int)s.charAt(i)]++;
		}
		for(i=0; i<s.length(); i++)
			if(count[(int)s.charAt(i)]==1)
			{
				no++;
				System.out.print(s.charAt(i));
			}
		System.out.println("Number of unique characters: "+ no);
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		sc.close();
		Distinct(s);
		sc.close();
	}
}