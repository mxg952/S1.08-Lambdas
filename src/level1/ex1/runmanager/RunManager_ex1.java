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
        words.add("Adeu");
        words.add("Hello");
        words.add("Hola");
        words.add("Murcielago");
    }

    public void ofilter () {
        List<String> result = this.words.stream()
                .filter(word -> word.contains("o")).toList();
        System.out.println("Word with 'o': " + result);
    }

}