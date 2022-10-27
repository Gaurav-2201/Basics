import java.util.*;
class Reverse
{
	public static StringBuilder Reversed(String s)
	{
		StringBuilder ans = new StringBuilder();
		ans.append(s);
		return ans.reverse();
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.print(Reversed(s));
		sc.close();
	}
}