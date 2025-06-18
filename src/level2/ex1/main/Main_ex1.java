package level2.ex1.main;

import level2.ex1.runmain.RunMain_ex1;

public class Main_ex1 {
    public static void main(String[] args) {
        RunMain_ex1 runMainEx1 = new RunMain_ex1();
        runMainEx1.loadCollection();
        runMainEx1.filterNames();
    }
}