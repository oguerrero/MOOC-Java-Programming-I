import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        String command = "";

        while (!command.equals("Quit")) {
            System.out.print("? ");
            command = scan.nextLine();
            commandCenter(command, scan, birds);
        }

    }

    public static void commandCenter(String command, Scanner scan, ArrayList<Bird> birds) {
        switch (command) {
            case "Add":
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Latin name: ");
                String latinName = scan.nextLine();
                Bird bird = new Bird(name, latinName);
                birds.add(bird);
                break;
            case "Observation":
                System.out.println("Bird? ");
                String observed = scan.nextLine();
                for (Bird bird1 : birds) {
                    if (bird1.getName().equals(observed)) {
                        bird1.addObservation();
                    }
                }
                break;
            case "All":
                for (Bird bird1 : birds) {
                    System.out.println(bird1);
                }
                break;
            case "One":
                System.out.println("Bird? ");
                String what = scan.nextLine();
                for (Bird bird1 : birds) {
                    if (bird1.getName().equals(what)) {
                        System.out.println(bird1);
                    }
                }
                break;
            case "Quit":
                break;
        }
    }

}
