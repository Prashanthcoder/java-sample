package exceptionproject;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***main starts******");
		try {
			int i=1/0;
		}
		catch(ArithmeticException e) {
			System.out.println("handled....");
		}
			System.out.println("*******main ends*****");
		
	}

}
