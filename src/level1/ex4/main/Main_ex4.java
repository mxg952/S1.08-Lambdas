package level1.ex4.main;

import level1.ex4.runmanager.RunManager_ex4;

public class Main_ex4 {
    public static void main(String[] args) {
        RunManager_ex4 runManager = new RunManager_ex4();
        runManager.loadWords();
        runManager.printMonthsMethodReference();
    }
}