package level1.ex6.main;

import level1.ex6.runmanager.RunManager_ex6;

public class Main_ex6 {
    public static void main(String[] args) {
        RunManager_ex6 runManager = new RunManager_ex6();
        runManager.loadWords();
        runManager.sortStringListShortToLong();
    }
}