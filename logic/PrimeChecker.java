import java.util.Scanner;

public class PrimeChecker {
    public static boolean isPrime(int n) {
        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }
        // Check for factors from 2 up to the square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                // If a factor is found, it's not prime
                return false;
            }
        }
        // If no factors are found, the number is prime
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check Prime or Not: ");
int number = scanner.nextInt();
String sr=" ";
		while(!sr.equals("exit")){
 sr = scanner.nextLine();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
 number = scanner.nextInt();
        } else {
            System.out.println(number + " is not a prime number");
 number = scanner.nextInt();
        }}
    }
}
