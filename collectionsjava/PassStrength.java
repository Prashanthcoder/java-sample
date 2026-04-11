package collectionsjava;

import java.util.*;

class PasswordChecker {
    static ArrayList<String> history = new ArrayList<>();

    public static void checkPassword(String pwd) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        // Length check
        if (pwd.length() < 8) {
            System.out.println("Weak Password (too short)");
            history.add(pwd);
            return;
        }

        // Check characters
        for (int i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i);

            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isLowerCase(ch)) hasLower = true;
            if (Character.isDigit(ch)) hasDigit = true;
        }

        int score = 0;
        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;

        // Strength result
        if (score == 3) {
            System.out.println("Strong Password 💪");
        } else if (score == 2) {
            System.out.println("Medium Password 🙂");
        } else {
            System.out.println("Weak Password ⚠️");
        }

        history.add(pwd);
    }

    public static void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No passwords checked yet.");
        } else {
            System.out.println("Checked Passwords:");
            for (String pwd : history) {
                System.out.println(pwd);
            }
        }
    }
}

public class PassStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Check Password");
            System.out.println("2. Show History");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter password: ");
                    String pwd = sc.nextLine();
                    PasswordChecker.checkPassword(pwd);
                    break;

                case 2:
                    PasswordChecker.showHistory();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}