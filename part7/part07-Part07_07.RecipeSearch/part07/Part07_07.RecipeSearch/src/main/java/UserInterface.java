import java.util.Scanner;

public class UserInterface {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        Recipes recipes = new Recipes();

        System.out.print("File to read: ");
        String file = scanner.nextLine();

        recipes.loadRecipes(file);

        commandMenu();

        System.out.print("Enter command: ");
        String command = scanner.nextLine();

        switch (command) {
            case "list":
                recipes.listRecipes();
                break;
            case "find name":
                System.out.print("Searched word: ");
                String name = scanner.nextLine();
                recipes.findByName(name);
                break;
            case "find cooking time":
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.parseInt(scanner.nextLine());
                recipes.findByCookingTime(maxCookingTime);
                break;
            case "find ingredient":
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                recipes.findByIngredient(ingredient);
                break;
            case "stop":
                break;
        }

        scanner.close();
    }

    public void commandMenu() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }
}
