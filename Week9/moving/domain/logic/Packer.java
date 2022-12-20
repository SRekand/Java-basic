package Week9.moving.domain.logic;

import Week9.moving.domain.Box;
import Week9.moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public int boxesVolume() {
        return this.boxesVolume;
    }
    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
        Box box = new Box(this.boxesVolume);
        for (Thing thing : things) {
            if (!box.addThing(thing)) {
                boxes.add(box);
                box = new Box(this.boxesVolume);
                box.addThing(thing);
            }
        }
        boxes.add(box);
        return boxes;
    }
}
