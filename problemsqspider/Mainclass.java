package problemsqspider;
import java.util.*;
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Choose your option: \n1.Palindrome check\n2.Prime check\n3.Reverse a number\n4.Sum of digits\n5.count digits in a number\n6.swap two numbers\n7.factorial of a number\n8.Fibonacci series\n");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1: System.out.println("enter the string to check palindrome");
			Palindrome.test(sc.nextLine());
			break;
		case 2: System.out.println("enter the number to check whether it is prime or not");
			int num = sc.nextInt();
			PrimeNumber.primeCheck(num);
			break;
		case 3: System.out.println("enter the number to reverse the number");
		   int numRev = sc.nextInt();
		   ReverseNum.rev(numRev);
		break;
		case 4: System.out.println("enter the number till you want to add them");
		int sum = sc.nextInt();
		SumOfDigits.add(sum);
		break;
		case 5: System.out.println("enter the number to know the count of digits");
			int num1 = sc.nextInt();
			CountofDigits.CountNum(num1);
			break;
		case 7: System.out.println("enter the number to get factorial");
		int nu2 = sc.nextInt();
		Facto.fact(nu2);
		default: System.out.println("please choose between 1-8");
		break;
		}
		

	}

}
}
