import java.rmi.AccessException;


public class Arthmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2/0;
try{
	System.out.println(a);
}
catch (ArithmeticException e){
	System.out.println(e);
}
	System.out.println("Result " + a);
}
}


