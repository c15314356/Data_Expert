import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader 
{
	private String fileName;
	private File filePath;
	
	public FileReader(String fileName)
	{
		this.fileName=fileName;
		this.filePath=new File(fileName);
	}
	
	public void readFile()
	{
		int i=0;
		try 
		{
			Scanner myScanner = new Scanner(filePath);
			System.out.println(filePath);
			//read through the CSV file
			myScanner.useDelimiter(",");
			
			while (myScanner.hasNext()&& i<150)
			{
				String line = myScanner.next();
				System.out.println(line+"|");
				i++;
			}
			myScanner.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Cannot find file....");
		} 	
	}
}
