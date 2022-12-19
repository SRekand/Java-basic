package Week7;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    HashMap<String, String> dictionary;

    public Dictionary() {
        dictionary = new HashMap<String, String>();
    }
    public void add(String word, String translation) {
        dictionary.put(word, translation);
    }

    public String translate(String word) {
        return dictionary.get(word);
    }
    public int amountOfWords() {
        return dictionary.size();
    }
    public ArrayList<String> translationList() {
        ArrayList<String> translations = new ArrayList<String>();
        for(String word: dictionary.keySet()) {
            translations.add(word + " = " + dictionary.get(word));
        }
        return translations;
    }
}
