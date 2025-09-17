package DiceGame;

import java.util.Scanner;

public class lab2_noormuttakidriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        lab2_noormuttaki game = new lab2_noormuttaki();

        System.out.println("Welcome to the Dice Game!");
        System.out.println("Press Enter to roll 4 dice...");
        scanner.nextLine();

        int sum = game.rollFourDice();
        System.out.println("You rolled a total of: " + sum);

        // Win numbers
        if (sum == 7 || sum == 11 || sum == 15 || sum == 21) {
            System.out.println("You win! :)");
            scanner.close();
            return;
        }

        // Lose numbers (including 13)
        if (sum == 10 || sum == 12 || sum == 13 || sum == 19 || sum == 20 ||
            sum == 22 || sum == 23 || sum == 24) {
            System.out.println("You lose! :( ");
            scanner.close();
            return;
        }

        int goal = sum;
        System.out.println("Your goal is now: " + goal);
        System.out.println("Keep rolling until you match your goal to win, or roll a losing number.");

        while (true) {
            System.out.println("Press Enter to roll again...");
            scanner.nextLine();

            int newRoll = game.rollFourDice();
            System.out.println("You rolled a total of: " + newRoll);

            if (newRoll == goal) {
                System.out.println("You matched your goal! You win!");
                break;
            } else if (newRoll == 10 || newRoll == 12 || newRoll == 13 ||
                       newRoll == 19 || newRoll == 20 || newRoll == 22 ||
                       newRoll == 23 || newRoll == 24) {
                System.out.println("❌ You rolled a losing number! You lose!");
                break;
            } else {
                System.out.println("No win/lose yet... keep rolling!");
            }
        }

        scanner.close();
    }
}
