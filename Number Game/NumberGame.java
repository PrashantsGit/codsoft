package codsoft;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rannum, guess, count = 0, score = 10;
        int max = 100;
        int min = 1;
        int range = max - min + 1;

        // generate random numbers within 1 to 100

        rannum = (int) (Math.random() * range) + min;
        while (true) {
            System.out.println("Enter your guess between range(1-100)");
            guess = sc.nextInt();
            count++;
            if (guess == rannum) {
                System.out.println("Correct! you win!");
                System.out.println("It took you " + count + " tries");
                System.out.println("Score = " + score);
                break;
            } else if (rannum > guess) {
                System.out.println("Nope!The number is higher.Guess again.");
                score--;
            } else {
                System.out.println("Nope!The number is lower.Guess again.");
                score--;
            }
        }
        System.out.println("Random number was " + rannum);
        sc.close();
    }
}
