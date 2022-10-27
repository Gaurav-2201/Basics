import java.sql.*;
class DatabaseConnection
{
	public static void main(String[] args)
	{
		try
		{
			String url = "jdbc:mysql://localhost:3306/emp_table";
			Connection con = DriverManager.getConnection(url, "root", "root");
			con.close();
		}
		catch(SQLException e)
		{
			System.out.println("Database not found");
		}
		finally
		{
			System.out.println("Closing connection");
		}
	}
}