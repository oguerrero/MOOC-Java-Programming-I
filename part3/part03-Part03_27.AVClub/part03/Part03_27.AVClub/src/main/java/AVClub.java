
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(" ");

            if (input.equals("")) {
                break;
            }

            for (String piece : pieces) {
                if (piece.contains("av")) {
                    System.out.println(piece);
                }
            }
        }
    }
}
