package Filehandiling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Createfile {

	public static void main(String[] args) {
		try
		{
		// TODO Auto-generated method stub
		File obj = new File("C:\\Users\\praV2C18469\\workspace\\Sample2\\pkg.txt");
	
		if(obj.createNewFile()){
			System.out.println("File has been created");
		}
		else{
			System.out.println("An error has been occured");	
		}
		}catch(IOException e){
		System.out.println("An errror has been occured");
		e.printStackTrace();
		}
}
}
