import java.util.Scanner;

public class DieRoller { // class beings
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            int die1;
            int die2;
            int die3;
            int roll;
            int throwCount = 0;

            System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Throw#", "Die1", "Die2", "Die3", "Sum");

            do {
                die1 = (int) (Math.random() * 6) + 1;
                die2 = (int) (Math.random() * 6) + 1;
                die3 = (int) (Math.random() * 6) + 1;
                roll = die1 + die2 + die3;
                throwCount++;

                System.out.printf("%-10d %-10d %-10d %-10d %-10d%n", throwCount, die1, die2, die3, roll);
            } while (die1 != die2 || die1 != die3);

            System.out.println("All dice are the same after " + throwCount + " throws.");
            System.out.print("Do you want to roll again? (yes/no): ");
            userInput = scanner.next();
        } while (userInput.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
} // class ends
