package Week3;

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Type a word: ");

        String input = obj.nextLine();
        System.out.println("Length of the first part: ");
        int length = obj.nextInt();

        String result = firstPart(input, length);
        System.out.println("Result: " + result);
    }
    public static String firstPart(String input, int length) {
        return input.substring(0, length);
    }
}
