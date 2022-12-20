package Week9.moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private int maximumCapacity;
    private int currentCapacity;
    private List<Item> items;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.currentCapacity = 0;
        this.items = new ArrayList<Item>();
    }

    public boolean addThing(Thing thing) {
        if (this.currentCapacity + thing.getVolume() <= this.maximumCapacity) {
            this.items.add((Item) thing);
            this.currentCapacity += thing.getVolume();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.items.size() + " items, total volume " + this.currentCapacity + " dm^3";
    }

    public String getVolume() {
        return this.currentCapacity + " dm^3";
    }
}
