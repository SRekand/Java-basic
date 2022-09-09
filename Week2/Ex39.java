package Week2;

public class Ex39 {
    private static void printStars(int amount) {
        int times = 1;

        while (times <= amount) {
            System.out.print("*");
            times++;
        }
    }

    private static void printSquare(int sideSize) {
        int row = 1;
        while (row <= sideSize) {
            int field = 1;
            while (field <= sideSize) {
                System.out.println("*");
                field++;
            }
            System.out.println();
            row++;
        }
    }

    public static void main(String[] args) {
        printSquare(4);
    }
}
