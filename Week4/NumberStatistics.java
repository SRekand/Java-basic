package Week4;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        sum += number;
        amountOfNumbers++;
    }

    public int sum() {
        return sum;
    }
}