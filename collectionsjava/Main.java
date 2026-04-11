package assignment7_4_26;


import java.util.*;

class GuessGame {
    static ArrayList<Integer> scores = new ArrayList<>();

    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;

        System.out.println("Guess number between 1-100");

        while (guess != number) {
            guess = sc.nextInt();
            attempts++;

            if (guess < number) {
                System.out.println("Too low");
            } else if (guess > number) {
                System.out.println("Too high");
            } else {
                System.out.println("Correct! Attempts: " + attempts);
                scores.add(attempts);
            }
        }
    }

    public static void showScores() {
        System.out.println("Scores: " + scores);

        if (!scores.isEmpty()) {
            int best = Collections.min(scores);
            System.out.println("Best Score: " + best);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Play Game");
            System.out.println("2. Show Scores");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    GuessGame.playGame();
                    break;
                case 2:
                    GuessGame.showScores();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}