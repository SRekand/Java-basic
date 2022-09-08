package Week2;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        System.out.println("Type number:");
        Scanner reader = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        while(true) {
            number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            sum += number;
            count++;
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("Sum is " + sum);
        System.out.println("How many number: " + count);
        System.out.println("Average: " + (double) sum / count);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
