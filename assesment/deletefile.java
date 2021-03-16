package Filehandiling;

import java.io.File;

public class deletefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File del= new File("C:\\Users\\praV2C18469\\workspace\\Sample2\\pkg.txt");
		if(del.delete()){
			System.out.println("File Has been Deleted....File name = "+del.getName());
		}
		else{
			System.out.println("Error Occured during Deletion....");
		}
		
	}

}
