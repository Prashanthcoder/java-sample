package exceptionproject;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****main starts******");
		try {
			int a = Integer.parseInt("445er");
			System.out.println(a);
		}
		catch(NumberFormatException e) {
			System.out.println("handled......");
		}
		System.out.println("*****main ends********");
	}

}
