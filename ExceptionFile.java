import java.util.*;
import java.io.*;
class ExceptionFile
{
	public static void main(String[] args) throws FileNotFoundException
	{
		try
		{
		File file = new File("sample1.txt");
		Scanner sc = new Scanner(file);
			while(sc.hasNextLine())
				System.out.println(sc.nextLine());
			sc.close();
		}
		catch(FileNotFoundException s)
		{
			System.out.println("File Not Found");
		}
		finally
		{
			System.out.println("The file contents have ended here.");
		}		
	}
}