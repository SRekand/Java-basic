package Week2;

public class Ex39 {
    private static void printStars(int amount) {
        int times = 1;

        while (true) {
            System.out.print("*");
            if (times == amount){
                break;
            }
            times++;
        }
    }
    public static void main(String[] args) {
        printStars(2);
    }
}
