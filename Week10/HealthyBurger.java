package Week10;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private Double healthyExtra1Price;
    private String healthyExtra2Name;
    private Double healthyExtra2Price;
    private String meat;
    private Double price;

    public HealthyBurger(String meat, Double price) {
        super("Healthy", meat, price, "Brown rye");
        this.meat = meat;
        this.price = price;
        System.out.println("Healthy burger on a brown rye roll with " + this.meat + ", price is " + this.price);
    }
    public void addHealthyAddition1(String name, Double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
    }
    public void addHealthyAddition2(String name, Double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
        }
        return hamburgerPrice;
    }
}
