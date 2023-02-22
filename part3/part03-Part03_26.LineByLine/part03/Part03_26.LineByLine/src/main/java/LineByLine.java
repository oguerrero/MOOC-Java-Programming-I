
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            String[] splitStringArray = userInput.split(" ");
            if (userInput.equals("")) {
                break;
            }

            for (String word : splitStringArray) {
                System.out.println(word);
            }
        }
    }
}
