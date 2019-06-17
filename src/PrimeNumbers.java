import java.util.Random;
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String []Args) {
        while (true) {
            boolean notPrime = false;
            Random rand = new Random();
            int number;
            Scanner scan = new Scanner(System.in);
            System.out.println("Would you like to use a random number? (Y|N) ");
            String answer = scan.nextLine();
            if(answer.equalsIgnoreCase("Y")) {
                number = rand.nextInt(250) + 1;
                System.out.println("Generating Random number ... " + number);
            } else {
                System.out.println("Please enter in a number: ");
                number = scan.nextInt();
                scan.nextLine();
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    notPrime = true;
                }
            }
            if (notPrime == false) {
                System.out.println("It's a prime number!");
            } else {
                System.out.println("It's not a prime number!");
            }
            System.out.println("Do you want to play again? (Y|N) ");
            String answer1 = scan.nextLine();
            if (answer1.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
