import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double average = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1) {
                break;
            }

            list.add(input);
        }

        for (int number : list) {
            sum += number;
            count++;
        }

        average = (double) sum / count;

        System.out.println("Average: " + average);

        scanner.close();
    }
}
