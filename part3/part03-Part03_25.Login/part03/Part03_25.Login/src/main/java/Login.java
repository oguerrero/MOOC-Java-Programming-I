
import java.util.HashMap;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        HashMap<String, String> users = new HashMap<>();

        users.put("alex", "sunshine");
        users.put("emma", "haskell");

        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

        scanner.close();
    }
}
