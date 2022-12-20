package Week9.application;

public class ConstantSensor implements Sensor {
    private int value;

    public ConstantSensor(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {
        // do nothing
    }

    @Override
    public void off() {
        // do nothing
    }

    @Override
    public int measure() {
        return value;
    }
}

