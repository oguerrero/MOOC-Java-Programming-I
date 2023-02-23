import java.util.ArrayList;

public class Suitcase {
    private final int maxWeight;
    private int currentWeight;

    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.currentWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
            this.currentWeight += item.getWeight();
        }
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        return this.currentWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviest = this.items.get(0);

        for (Item item : this.items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return "1 item (" + this.currentWeight + " kg)";
        } else {
            return this.items.size() + " items (" + this.currentWeight + " kg)";
        }
    }
}
