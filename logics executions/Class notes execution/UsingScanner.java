import java.util.Scanner;

class UsingScanner 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the student: ");
		String name = sc.nextLine();
		System.out.println("Enter the id number of the student: ");
		int id = sc.nextInt();
sc.nextLine();
		System.out.println("Enter the section of the student: ");
		char section = sc.next().charAt(0);
sc.nextLine();
		System.out.println("Enter the address : ");
		String address = sc.nextLine();

		System.out.println("Enter the phone number: ");
		long phno = sc.nextLong();
sc.nextLine();
		System.out.println("-------------STUDENT-------DETAILS---------------");
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
		System.out.println("Section : "+section);
		System.out.println("Address : "+address);
		System.out.println("Phonenumber: " + phno);
	}
}
