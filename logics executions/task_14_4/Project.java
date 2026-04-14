package task_14_4;
import java.util.Scanner;
public class Project {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name and gender");
	String cname = sc.nextLine();
	String gender = sc.nextLine();
	KYC kyc = new KYC();
	String Gid = kyc.GenerateId(cname, gender);
	System.out.println("The generated id will be "+Gid+" where random number generated is "+kyc.KYCID);
}
}
