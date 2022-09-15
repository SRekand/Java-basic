package Week4;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    private int average;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
        this.average = 0;
    }

    public void addNumber(int number) {
        this.amountOfNumbers++;
        this.sum += number;
        this.average /= number;
    }

    public int amountOfNumbers() {
        // code here
        return this.amountOfNumbers;
    }

    public int sum() {
        // code here
        return this.sum;
    }

    public double average() {
        // code here
        return this.average;
    }
}
