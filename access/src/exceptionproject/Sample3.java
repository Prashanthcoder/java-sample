package exceptionproject;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****main starts******");
			try {
				Sample3 s1 = null;
				System.out.println(s1.hashCode());
			}
			catch(NullPointerException e) {
				System.out.println("handled...");
			}
			System.out.println("******main ends*******");
	}

}
