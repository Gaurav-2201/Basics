import java.util.*;
class Vowel
{
	public static boolean Vowels(String s)
	{
		s = s.toLowerCase();
		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
				return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.print(Vowels(s));
		sc.close();
	}
}