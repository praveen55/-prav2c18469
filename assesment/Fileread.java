package Filehandiling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Fileread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File read = new File("C:\\Users\\praV2C18469\\workspace\\Sample2\\pkg.txt");
			Scanner pk = new Scanner (read);
			while(pk.hasNextLine())
			{
				String data = pk.nextLine();
				System.out.println(data);
			}
			pk.close();
		}
		catch(IOException e)
		{
			System.out.println("ERROR OCCURED...");
		}
	}
}
