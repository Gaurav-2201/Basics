import java.util.*;
class Remove_occurences
{
	public static String Remove(String s, char c)
	{
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i)==c)
				continue;
			else
				sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		System.out.print("Enter the character to remove: ");
		char c = sc.next().charAt(0);
		sc.close();
		System.out.print(Remove(s, c));
	}
}