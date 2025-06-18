package level1.ex3.main;

import level1.ex3.runmanager.RunManager_ex3;

public class Main_ex3 {
    public static void main(String[] args) {
        RunManager_ex3 runManager = new RunManager_ex3();
        runManager.loadWords();
        runManager.printYearMonths();
    }
}