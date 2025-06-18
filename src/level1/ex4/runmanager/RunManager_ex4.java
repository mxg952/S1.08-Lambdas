package level1.ex4.runmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunManager_ex4 {

    private List<String> words;

    public RunManager_ex4() {
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

    public void printMonthsMethodReference() {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");

        months.forEach(System.out::println);
    }

}