package level2.ex2.runmain;

import java.util.ArrayList;
import java.util.List;

public class RunMain_ex2 {
    private List<Integer> numbers;

    public RunMain_ex2() {
        this.numbers = new ArrayList<>();
    }

    public void loadCollection() {
        numbers.add(1);
        numbers.add(80);
        numbers.add(17434);
        numbers.add(13);
        numbers.add(54343);
    }

    public void filterIntegers() {
        List<String> resultList = this.numbers.stream()
                .map(number -> number % 2 == 0 ? "e" + number : "o" + number).toList();
        System.out.println("Final list: " + resultList);
    }



}
