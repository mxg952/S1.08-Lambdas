package level1.ex6.runmanager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunManager_ex6 {

    private List<String> words;

    public RunManager_ex6() {
        this.words = new ArrayList<>();
    }

    public void loadWords() {
        words.add("4");
        words.add("bye");
        words.add("1375");
        words.add("34545");
        words.add("3");
        words.add("Hola");
        words.add("Murcielago");
    }

    public void sortStringListShortToLong(){
        words.sort(Comparator.comparingInt(String::length));
        System.out.println("Sorted by short to long): " + words);
    }
}