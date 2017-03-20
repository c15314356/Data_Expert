//

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Control 
{
	public static void main(String[] args)
	{	
		/*
		//asks for what query the user would like to run
		System.out.println("Please enter a query you would like to run....");
		Scanner ans=new Scanner(System.in);
		String func=ans.nextLine();
		ans.close();
		
		//runs DatabaseReader class
		DatabaseReader data=new DatabaseReader(func);
		data.Connect();
		*/
		
		List<String> myarray= new ArrayList<String>();
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter in a String");
			Scanner temp=new Scanner(System.in);
			String ans=temp.nextLine();
			myarray.add(ans);
			temp.close();
		}
		
		for (String element:myarray)
		{
			System.out.println(element);
			
			
		}
		
	}
}