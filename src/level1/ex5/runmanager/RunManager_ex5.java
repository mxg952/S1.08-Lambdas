package level1.ex5.runmanager;

import level1.ex5.functionalinterface.PiValue;

import java.util.ArrayList;
import java.util.List;

public class RunManager_ex5 {

    private List<String> words;

    public RunManager_ex5() {
        this.words = new ArrayList<>();
    }

    public void getPiValueValue(){
        PiValue pi = () -> 3.1415;
        System.out.println("Pi value: " + pi.getPiValue());
    }

}