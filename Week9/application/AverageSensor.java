package Week9.application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private Sensor[] sensors;
    private boolean isOn;
    private List<Integer> readings;

    public AverageSensor() {
        sensors = new Sensor[0];
        isOn = false;
        readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        Sensor[] newSensors = new Sensor[sensors.length + 1];
        for (int i = 0; i < sensors.length; i++) {
            newSensors[i] = sensors[i];
        }
        newSensors[sensors.length] = toAdd;
        sensors = newSensors;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void on() {
        isOn = true;
        for (Sensor sensor : sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        isOn = false;
        for (Sensor sensor : sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if (isOn) {
            int sum = 0;
            for (Sensor sensor : sensors) {
                sum += sensor.measure();
            }
            int average = sum / sensors.length;
            readings.add(average);
            return sum / sensors.length;
        } else {
            throw new IllegalStateException("AverageSensor is off");
        }
    }

    public List<Integer> readings(){
        return this.readings;
    }
}
