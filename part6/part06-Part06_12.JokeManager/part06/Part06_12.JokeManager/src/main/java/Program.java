
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        UserInterface ui = new UserInterface(new JokeManager(), new Scanner(System.in));
        ui.start();
    }
}
