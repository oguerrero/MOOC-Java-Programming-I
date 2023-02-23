public class Item {
    private final String identifier;
    private final String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Item)) {
            return false;
        }

        Item comparedItem = (Item) compared;

        return this.identifier.equals(comparedItem.identifier);
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
