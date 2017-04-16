//

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Control 
{
	public static void main(String[] args)
	
	{	
		DatabaseReader data=new DatabaseReader();
		Scanner ans=new Scanner(System.in);
		//asks for what query the user would like to run
		for(int i=0;i<2;i++)
		{
			System.out.println("Please enter a query you would like to run....");
			String func=ans.nextLine();
			
			//runs DatabaseReader class
			data.setStatement(func);
			data.Connect();
		}

		
		
		/*
		List<String> myarray= new ArrayList<String>();
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter in a String");
			Scanner temp=new Scanner(System.in);
			String ans=temp.nextLine();
			myarray.add(ans);
		}
		
		for (String element:myarray)
		{
			System.out.println(element);
			String[] word=element.split("\\s+");
			
			for(String words:word)
			{
				System.out.println(words);
			}
		}
		*/
	}
}