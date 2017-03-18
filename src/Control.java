import java.util.Scanner;

public class Control 
{

	public static void main(String[] args)
	{
		//asks for what query the user would like to run
		System.out.println("Please enter a query you would like to run....");
		Scanner ans=new Scanner(System.in);
		String func=ans.nextLine();
		ans.close();
		
		//runs DatabaseReader class
		DatabaseReader data=new DatabaseReader(func);
		data.Connect();
	}
}