package level1.ex1.runmanager;

import java.util.ArrayList;
import java.util.List;

public class RunManager_ex1 {

    private List<String> words;

    public RunManager_ex1() {
        this.words = new ArrayList<>();
    }

    public void loadWords() {
        words.add("Adios");
        words.add("bye");
        words.add("Ciao");
        words.add("Adéu");
        words.add("Hello");
        words.add("Hola");
        words.add("Murciélago");
    }

    public List<String> filter() {
        return this.words.stream()
                .filter(word -> word.contains("o")).toList();
            }

}