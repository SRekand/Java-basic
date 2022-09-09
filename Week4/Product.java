package Week4;

public class Product {
    private double priceAtStart;
    private int amountAtStart;
    private String nameAtStart;

    // get/set price
    public double getPriceAtStart() {
        return priceAtStart;
    }

    public void setPriceAtStart(double priceAtStart) {
        this.priceAtStart = priceAtStart;
    }

    // get/set amount
    public int getAmountAtStart() {
        return amountAtStart;
    }

    public void setAmountAtStart(int amountAtStart) {
        this.amountAtStart = amountAtStart;
    }

    // get/set name
    public String getNameAtStart() {
        return nameAtStart;
    }

    public void setNameAtStart(String nameAtStart) {
        this.nameAtStart = nameAtStart;
    }

    public Product(double priceAtStart, int amountAtStart, String nameAtStart) {
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
        this.nameAtStart = nameAtStart;
    }

    public void printProduct() {
        System.out.println(this.nameAtStart + ", price " + this.priceAtStart + ", amount " + this.amountAtStart );
    }

    @Override
    public String toString() {
        return this.nameAtStart + ", price " + this.priceAtStart + ", amount " + this.amountAtStart;
    }
}
