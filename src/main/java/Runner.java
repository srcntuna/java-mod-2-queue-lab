import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        var restaurant = new Restaurant();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {

                System.out.println("What do you want to do?:");
                System.out.println("1. Check-in");
                System.out.println("2. Check-out");
                String customerSelection = scanner.nextLine();

                if (customerSelection.equals("1")) {
                    System.out.println("What is your name?");
                    String customerName = scanner.nextLine();
                    restaurant.checkIn(customerName.toLowerCase());
                } else if (customerSelection.equals("2")) {

                    System.out.println("What is your name?");
                    String customerName = scanner.nextLine();
                    restaurant.checkOut(customerName.toLowerCase());

                } else {
                    throw new InputMismatchException("Option must be either 1 or 2");
                }

            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }

    }

}