import java.util.*;
import java.text.SimpleDateFormat;
class DateFormat
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose 1 for YYYY-MM-DD, 2 for DD-MM-YYYY, 3 for DD-MM-YY, 4 for YYYY-MM-DD HH:MM:SS");
		int n = sc.nextInt();
		String ans, pattern;
		SimpleDateFormat date = new SimpleDateFormat();
		
		switch(n)
		{
			case 1: pattern = "yyyy-MM-dd";
					date = new SimpleDateFormat(pattern);
					ans = date.format(new Date());
					System.out.print(ans); break;
			case 2: pattern = "dd-MM-yyyy";
					date = new SimpleDateFormat(pattern);
					ans = date.format(new Date());
					System.out.print(ans); break;
			case 3: pattern = "dd-MM-yy";
					date = new SimpleDateFormat(pattern);
					ans = date.format(new Date());
					System.out.print(ans); break;
			case 4: pattern = "yyyy-MM-dd hh:mm:ss";
					date = new SimpleDateFormat(pattern);
					ans = date.format(new Date());
					System.out.print(ans); break;
			default: System.out.print("Invalid");
		}
		sc.close();
	}
}