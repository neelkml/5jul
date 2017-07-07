package neel;
import java.io.*;
public class Tryexample {
	

	public static void mainj(String args[]) throws IOException
	{
		try {
		FileInputStream fis=null;
		fis= new FileInputStream("d:/myfile.txt");
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.print((char)k);
		
		}
		fis.close();
		}
		catch(FileNotFoundException  exception)
		{
			
		System.out.println("wrong");
	}
		
	}

}
