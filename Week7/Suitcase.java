package Week7;

import java.util.ArrayList;

public class Suitcase {
    ArrayList<Thing> things = new ArrayList<Thing>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        if (this.totalWeight() + thing.getWeight() <= this.maxWeight) {
            this.things.add(thing);
        }
    }

    @Override
    public String toString() {
        String languageControl = "";
        if (things.size() == 0) {
            languageControl = "empty";
        } else if (things.size() == 1) {
            languageControl = "1 thing";
        } else {
            languageControl = things.size() + " things";
        }
        return languageControl + " (" + totalWeight() + " kg)";
    }
    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }
    public int totalWeight() {
        int totalWeight = 0;
        for (Thing thing : things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }
    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }
        Thing heaviestThing = things.get(0);
        for (Thing thing : things) {
            if (thing.getWeight() > heaviestThing.getWeight()) {
                heaviestThing = thing;
            }
        }
        return heaviestThing;
    }
    public ArrayList<Thing> getThings() {
        return things;
    }
}
