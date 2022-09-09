package Week4;

public class Product {
    private double priceAtStart;
    private int amountAtStart;
    private String nameAtStart;

    public Product(double priceAtStart, int amountAtStart, String nameAtStart) {
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
        this.nameAtStart = nameAtStart;
    }

    public void printProduct() {
        System.out.println(this.nameAtStart + ", price " + this.priceAtStart + ", amount " + this.amountAtStart );
    }
}
