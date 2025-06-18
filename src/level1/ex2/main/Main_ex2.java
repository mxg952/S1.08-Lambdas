package level1.ex2.main;

import level1.ex2.runmanager.RunManager_ex2;

public class Main_ex2 {
    public static void main(String[] args) {
        RunManager_ex2 runManager = new RunManager_ex2();
        runManager.loadWords();
        runManager.letterFilter();
    }
}