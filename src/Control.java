import java.io.File;
import java.util.Scanner;

public class Control {

	public static void main(String[] args) 
	
	{
		//System.out.println("Please enter the file path....");
		//Scanner path = new Scanner(System.in);
		//String name =new String(path.nextLine());
		
		//FileReader file= new FileReader(name);
		FileReader file= new FileReader("C:\\g1.csv");
		
		file.readFile();
	}

}