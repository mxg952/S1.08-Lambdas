package level1.ex2.runmanager;

import java.util.ArrayList;
import java.util.List;

public class RunManager_ex2 {

    private List<String> words;

    public RunManager_ex2() {
        this.words = new ArrayList<>();
    }

    public void loadWords() {
        words.add("Adios");
        words.add("bye");
        words.add("Ciao");
        words.add("Adeu");
        words.add("Hello");
        words.add("Hola");
        words.add("Murcielago");
    }

    public void letterFilter() {
        List<String> result = this.words.stream()
                .filter(word -> word.contains("o") && word.length() > 5).toList();

        System.out.println("Word with 'o' and with more than 5 letters: " + result);

    }

}