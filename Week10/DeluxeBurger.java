package Week10;

public class DeluxeBurger extends Hamburger implements Interface {
    private String chips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        this.chips = "Chips";
        this.drink = "Drink";
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        hamburgerPrice += 2.75;
        System.out.println("Added " + this.chips + " for an extra 2.75");
        hamburgerPrice += 1.81;
        System.out.println("Added " + this.drink + " for an extra 1.81");
        return hamburgerPrice;
    }
}


