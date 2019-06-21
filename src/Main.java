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
                // Must read the entire line to reset the input
                read.nextLine();
                System.out.print(num + " ");
                while (num != 1) {
                    if (num % 2 == 0) {
                        num = num / 2;
                    } else {
                        num = (num * 3) + 1;
                    }
                    System.out.print(num + " ");
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
