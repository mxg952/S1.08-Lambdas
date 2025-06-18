package level1.ex7.runmanager;

import java.util.ArrayList;
import java.util.List;

public class RunManager_ex7 {

    private List<String> words;

    public RunManager_ex7() {
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

    public void sortStringListLongToShort(){
        words.sort((a, b) -> Integer.compare(b.length(), a.length()));
        System.out.println("Sorted by long to short): " + words);
    }
}