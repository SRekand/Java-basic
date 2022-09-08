package Week2;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        System.out.println("Type number:");
        Scanner reader = new Scanner(System.in);

        int number;
        int sum = 0;

        while(true) {
            number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            sum += number;
        }
        System.out.println("Thank you and see you later!");
        System.out.println("Sum is " + sum);
    }
}
