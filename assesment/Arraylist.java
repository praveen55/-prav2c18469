import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Arraylist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> EmployeeList = new ArrayList<String>();
		EmployeeList.add("Edwin");
		EmployeeList.add("Jhon");
		EmployeeList.add("Max");
		EmployeeList.add("Clint");
		System.out.println("EmployeeList:" +EmployeeList);
		{
		ArrayList<Integer> EmployeeID= new ArrayList<Integer>();
		EmployeeID.add(1001);
		EmployeeID.add(1002);
		EmployeeID.add(1003);
		EmployeeID.add(1004);
	    System.out.println("EmployeeID:" + EmployeeID);
	    {
	    ArrayList<String> EmployeeList2 = new ArrayList<String>();
	    EmployeeList2.add("chris");
	    EmployeeList2.add("David");
	    EmployeeList2.add("Groot");
	    EmployeeList2.add("Harry");
		System.out.println("EmployeeList2"+EmployeeList2);
		{
		ArrayList<Integer> EmployeeID2= new ArrayList<Integer>();
		EmployeeID2.add(1005);
		EmployeeID2.add(1006);
		EmployeeID2.add(1007);
		EmployeeID2.add(1008);
		
		EmployeeList.addAll(EmployeeList2);
		System.out.println(EmployeeList);
		
		EmployeeList.remove(3);
	    EmployeeList.set(3,"pk");
	    
		System.out.println(EmployeeList);
		EmployeeID.addAll(EmployeeID2);
		System.out.println(EmployeeID);
	}
	}
}
}
}
