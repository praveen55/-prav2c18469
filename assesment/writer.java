package Filehandiling;

import java.io.FileWriter;
import java.io.IOException;

public class writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		FileWriter myFile = new FileWriter("pkg.txt");
		myFile.write("The JDT project provides the tool plug-ins that implement a Java IDE\n"
				+ "supporting the development of any Java application,\n"
				+ "including Eclipse plug-ins.\n"
				+ "It adds a Java project nature and Java perspective to the Eclipse Workbench as well as a numberof views,\n"
				+ "editors, wizards, builders, and code merging andrefactoring tools.\n"
				+ "The JDT project allows Eclipse to be adevelopment environment for itself.\n"
				+ "A Java project contains source code and related files for building a Java program.\n"
				+ "It has anassociated Java builder that can incrementally compile\n"
				+ "Java source files as they are changed. \n");
		myFile.close();
		System.out.println("File has been created succesfully");
	}catch(IOException e){
		System.out.println("Error Occured");
	}
}
}
