package Week9.moving.domain;

public class Item extends Thing implements Comparable<Item> {
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }
    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return name + " (" + volume + " dm^3)";
    }

    @Override
    public int compareTo(Item item) {
        return this.volume - item.volume;
    }
}
