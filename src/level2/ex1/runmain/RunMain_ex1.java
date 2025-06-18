package level2.ex1.runmain;

import java.util.ArrayList;
import java.util.List;

public class RunMain_ex1 {
    private List<String> names;

    public RunMain_ex1() {
        this.names = new ArrayList<>();
    }

    public void loadCollection() {
        names.add("Ari");
        names.add("Adri");
        names.add("Marc");
        names.add("Andrea");
        names.add("Ana");
        names.add("Pablo");
        names.add("Altay");
    }

    public void filterNames() {
        List<String> result = this.names.stream()
                .filter(name -> name.startsWith("A") && name.length() == 3).toList();
        System.out.println("Names whith first letter 'A' and 3 letters: " + result);
    }



}
