import java.util.*;
import java.io.*;
class Search_in_file
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String w = sc.next();
		boolean flag = false;
		Scanner sc1 = new Scanner(new FileInputStream("sample1.txt"));
		while(sc1.hasNextLine())
		{
			String line = sc1.nextLine();
			if(line.indexOf(w)!=-1)
			{
				flag = true;
			}
		}
		if(flag)
			System.out.println("Word found");
		else
			System.out.println("Not Found");
		sc.close();
	}
}