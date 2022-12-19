package Week7;

import java.util.Scanner;

public class TextUserInterface {
    private Dictionary dictionary;
    private Scanner reader;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statements:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface");
        System.out.println("");

        while(true) {
            System.out.print("Statement: ");
            String input = reader.nextLine();
            if(input.equals("quit")) {
                System.out.println("Goodbye!");
                break;
            } else if(input.equals("add")) {
                System.out.println("In Finnish: ");
                String word = reader.nextLine();
                System.out.println("Translation: ");
                String translation = reader.nextLine();
                dictionary.add(word, translation);
            } else if(input.equals("translate")) {
                System.out.println("Give a word: ");
                String word = reader.nextLine();
                System.out.println("Translation: " + dictionary.translate(word));
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
}
