
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList<>();
        Operations operations = new Operations();
        
        System.out.println("Enter points totals, -1 stops: ");

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1) {
                break;
            }

            if (input > 0 && input < 100) {
                points.add(input);
            }
        }

        System.out.println("Point average (all): " + operations.average(points));
        System.out.println("Point average (passing): " + operations.averagePassing(points));
        System.out.println("Pass percentage: " + operations.passPercentage(points));
        System.out.println(operations.gradeDistribution(points));
    }
}
