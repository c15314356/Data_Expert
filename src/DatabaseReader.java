import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseReader 
{
	private String uname;
	private String upass;
	private String statement;
	
	public DatabaseReader(String statement)
	{
		this.uname="Builder2";
		this.upass="br0adband1";
		this.statement=statement;
	}
	
	public void Connect()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe",uname,upass);
			Statement func = con.createStatement();
			ResultSet results = func.executeQuery(statement);
			
			while (results.next())
			{
				for (int i=0; i<13;i++)
				{
					System.out.print(results.getString(i+1)+"\t");
				}
				System.out.print("\n");
			}
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		} 
	}
}
