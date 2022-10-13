package Week3;

import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Type your name: ");
        String userName = obj.nextLine();

        if (userName.length() < 3) {
            System.out.println("");
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println(i + "." + "character:" + userName.charAt(i));
            }
        }
    }
}
