import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");

        int userNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("You gave the number " + userNumber);

        scanner.close();
    }
}
