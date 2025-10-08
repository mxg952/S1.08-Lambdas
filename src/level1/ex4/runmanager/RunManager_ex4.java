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
        words = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");
    }

    public void printMonthsMethodReference() {
        words.forEach(System.out::println);
    }

}