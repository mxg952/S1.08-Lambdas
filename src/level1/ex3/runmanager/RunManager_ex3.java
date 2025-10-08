package level1.ex3.runmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunManager_ex3 {

    private List<String> months;

    public RunManager_ex3() {
        this.months = new ArrayList<>();
    }

    public void loadWords() {
        months = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");
    }

    public void printYearMonths(){
        months.forEach(month -> System.out.println(month));
    }

}