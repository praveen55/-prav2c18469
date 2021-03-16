
public class Arrayoutofbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int array[] =new int[5];
			array[6]=2;
			System.out.println(array[6]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}

