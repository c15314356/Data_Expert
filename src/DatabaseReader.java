import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseReader 
{
	private String uname;
	private String upass;
	private String statement;
	private List<String> allRows= new ArrayList<String>();
	private List<String> colNameList= new ArrayList<String>();
	
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
			ResultSetMetaData resultsMD=results.getMetaData();
			
			int colNumber=resultsMD.getColumnCount();
			
			//this loop will find all col names and add them to colNameList
			for(int i=1;i<colNumber+1;i++)
			{
				colNameList.add(resultsMD.getColumnLabel(i));
			}
			
			
			//this loop will
			while(results.next())
			{
				for(int i=1;i<colNumber+1;i++)
				{
					System.out.println(results.getString(i)+"\t");
					allRows.add(results.getString(i));
				}
				System.out.println("\n");
			}
			System.out.println("\n"+allRows.size());
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		} 
	}
	//getters and setters for DatabaseReader
	public String getUname() 
	{
		return uname;
	}

	public void setUname(String uname) 
	{
		this.uname = uname;
	}

	public String getUpass() 
	{
		return upass;
	}

	public void setUpass(String upass) 
	{
		this.upass = upass;
	}

	public String getStatement() 
	{
		return statement;
	}

	public void setStatement(String statement) 
	{
		this.statement = statement;
	}

	public List<String> getColNameList() {
		return colNameList;
	}

	public void setColNameList(List<String> colNameList) {
		this.colNameList = colNameList;
	}

	public List<String> getAllRows() {
		return allRows;
	}

	public void setAllRows(List<String> allRows) {
		this.allRows = allRows;
	}

}
