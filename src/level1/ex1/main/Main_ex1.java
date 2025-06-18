package level1.ex1.main;

import level1.ex1.runmanager.RunManager_ex1;

public class Main_ex1 {
    public static void main(String[] args) {
        RunManager_ex1 runManager = new RunManager_ex1();
        runManager.loadWords();
        runManager.ofilter();
    }
}