import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println();
        System.out.println("In this game, you will have the opportunity to test your guessing skills against the computer. Here’s how it works:");
        System.out.println();
        System.out.println("1. Objective: Your goal is to guess the secret number chosen by the computer.");
        System.out.println();
        System.out.println("2. Gameplay:");
        System.out.println("   - The computer will randomly select a number between 1 and 100 (inclusive).");
        System.out.println("   - You will make guesses to determine this number.");
        System.out.println("   - After each guess, the computer will provide feedback to guide you towards the correct answer.");
        System.out.println();
        System.out.println("3. Feedback:");
        System.out.println("   - If your guess is too high, the computer will inform you.");
        System.out.println("   - If your guess is too low, the computer will also let you know.");
        System.out.println("   - Use this feedback to adjust your next guess accordingly.");
        System.out.println();
        System.out.println("4. Winning: Keep guessing until you correctly identify the secret number. The game will then congratulate you on your victory!");
        System.out.println();
        System.out.println("5. Have Fun: Enjoy the challenge of narrowing down the possibilities and honing your intuition.");
        System.out.println();
        System.out.println("Are you ready to begin? Let’s see if you can guess the number! Good luck!");
        System.out.println();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("** Lets Begin **");
        System.out.println();


        Random num = new Random();
        int number;
        number = num.nextInt(100) + 1;

        int a;
        int b=0;
        do {
            System.out.println("Please enter your guess: ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            if (a < 1 || a > 100) {
                System.out.printf("The guess is Out of Range. Try again.%n");
            } else {
                b++;
                if (number == a) {
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                    System.out.println("Congratulations! You guessed the secret number.");
                    System.out.println("Total Number of Attempts: " + b);
                    System.out.println("System Generated number is :- " + number);
                    System.out.println(a + " is a guessing number.");
                } else if (a < number) {
                    System.out.println("Oops! Your guess is too low. Try guessing higher.");
                    System.out.println();
                    System.out.println("**************************************************");
                } else {
                    System.out.println("Oops! Your guess is too high. Try guessing lower.");
                    System.out.println();
                    System.out.println("***************************************************");
                }
            }
        } while (a != number);
    }
}
