
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here.
        // Use only the variables speed and limit.
        System.out.println("Give speed: ");
        int speed = Integer.valueOf(scanner.nextLine());
        int limit = 120;

        if (speed > limit) {
            System.out.println("Speeding ticket!");
        }

        scanner.close();
    }
}
