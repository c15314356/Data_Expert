import java.io.File;
import java.sql.*;
import java.util.Scanner;

public class Control {

	public static void main(String[] args) 
	
	{
		//System.out.println("Please enter the file path....");
		//Scanner path = new Scanner(System.in);
		//String name =new String(path.nextLine());
		
		//FileReader file= new FileReader(name);
		//FileReader file= new FileReader("C:\\g1.csv");
		
		//file.readFile();
		
		String uname="Builder2";
		String upass="br0adband1";
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection  c=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe",uname,upass);
			Statement func = c.createStatement();
			ResultSet rset = func.executeQuery("SELECT * FROM CORDER");
			
			while (rset.next())
			{
				for (int i=0; i<5;i++)
				{
					System.out.print(rset.getString(i+1)+"\t");
				}
				System.out.print("\n");
			}
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}

}