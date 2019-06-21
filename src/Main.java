import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String response = "y";
        // Continue with just a y in case a user misspells 'yes'
        while (response.contains("y")) {
            System.out.println("Please enter a number:");
            // Ask for another number if the input is not a number
            try {
                int num = read.nextInt();
                int guess = -1;
                int steps = 0;
                // Ask the user for a guess. If no input is provided, make guess -1 to indicate no guess
                try {
                    System.out.println("Guess the amount of steps:");
                    guess = read.nextInt();
                } catch (Exception e) {
                    guess = -1;
                }
                // Must read the entire line to reset the input
                read.nextLine();
                System.out.print(num + " ");
                steps++;
                while (num != 1) {
                    if (num % 2 == 0) {
                        num = num / 2;
                    } else {
                        num = (num * 3) + 1;
                    }
                    System.out.print(num + " ");
                    steps++;
                }
                if (guess > -1) {
                    System.out.println("\nYou guessed: " + guess + "\nThe answer was: " + steps);
                    if (guess > steps) {
                        System.out.println("You guessed too high!");
                    } else if (guess < steps) {
                        System.out.println("You guessed too low!");
                    } else {
                        System.out.println("You guessed just right!");
                    }
                }
                System.out.println("\nSequence complete!\nEnter another number? Type 'yes' to enter another number." +
                        " Or type 'no'.");
                response = read.nextLine();
            } catch (Exception e) {
                read.nextLine();
            }
        }
        System.out.println("Goodbye!");
    }
}
