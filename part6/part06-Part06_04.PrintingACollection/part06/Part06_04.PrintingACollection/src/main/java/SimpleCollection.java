
import java.util.ArrayList;

public class SimpleCollection {

    private final String name;
    private final ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        if (this.elements.size() == 1) {
            return "The collection " + this.name + " has 1 element:\n" + this.elements.get(0);
        }

        StringBuilder output = new StringBuilder("The collection " + this.name + " has " + this.elements.size() + " elements:\n");

        for (String element : this.elements) {
            output.append(element).append("\n");
        }

        return output.toString();
    }
}
