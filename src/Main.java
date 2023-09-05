import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        char continueChoice;

        do {
            System.out.println("Please write your text in the following line");
            userInput = scanner.nextLine();

            String uppercasedString = userInput.toUpperCase();
            System.out.println(uppercasedString);

            System.out.println("Do you want to continue Yes or No? ");
            continueChoice = scanner.next().charAt(0);
            scanner.nextLine();

        } while (continueChoice == 'Y' || continueChoice == 'y');

        System.out.println("Bye! :)");
        scanner.close();
    }
}