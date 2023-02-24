import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Recipes {

    private final ArrayList<Recipe> recipes;

    public Recipes() {
        this.recipes = new ArrayList<>();
    }

    public void loadRecipes(String file) {
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            ArrayList<String> fileLines = new ArrayList<>();

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                if (line.trim().isEmpty() || !fileScanner.hasNextLine()) {
                    String name = fileLines.get(0);
                    int time = Integer.parseInt(fileLines.get(1));
                    ArrayList<String> ingredientList = new ArrayList<>();

                    for (int i = 2; i < fileLines.size(); i++) {
                        ingredientList.add(fileLines.get(i));

                    }

                    recipes.add(new Recipe(name, time, ingredientList));
                    fileLines = new ArrayList<>();
                } else {
                    fileLines.add(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading file " + e.getMessage());
        }
    }

    public void listRecipes() {
        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public void findByName(String name) {
        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }

    public void findByCookingTime(int maxCookingTime) {
        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public void findByIngredient(String ingredient) {
        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}
