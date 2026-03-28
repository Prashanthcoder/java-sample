package exceptionproject;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****Main starts*******");
		try {
			int arr[] = {10, 20, 30};
			System.out.println(arr[9]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("handled .......");
		}
		
		System.out.println("******main ends******");
	}

}
