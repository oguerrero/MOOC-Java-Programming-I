import java.util.ArrayList;

public class Hold {
    private final int maxWeight;
    private int currentWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.currentWeight + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
            this.currentWeight += suitcase.totalWeight();
        }
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    public int totalWeight() {
        return this.currentWeight;
    }

    public Item heaviestItem() {
        if (this.suitcases.isEmpty()) {
            return null;
        }

        Item heaviest = this.suitcases.get(0).heaviestItem();

        for (Suitcase suitcase : this.suitcases) {
            Item heaviestInSuitcase = suitcase.heaviestItem();

            if (heaviestInSuitcase.getWeight() > heaviest.getWeight()) {
                heaviest = heaviestInSuitcase;
            }
        }

        return heaviest;
    }

    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        } else if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.currentWeight + " kg)";
        } else {
            return this.suitcases.size() + " suitcases (" + this.currentWeight + " kg)";
        }
    }
}
