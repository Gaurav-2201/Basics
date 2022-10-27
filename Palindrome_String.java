import java.util.*;
class Palindrome_String
{
	public static boolean Palindrome(String s)
	{
		for(int i = 0, j = s.length()-1; i<s.length()/2; i++, j--)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		System.out.print(Palindrome(s));
		sc.close();
	}
}