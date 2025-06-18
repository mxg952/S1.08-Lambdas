package level1.ex7.main;

import level1.ex7.runmanager.RunManager_ex7;

public class Main_ex7 {
    public static void main(String[] args) {
        RunManager_ex7 runManager = new RunManager_ex7();
        runManager.loadWords();
        runManager.sortStringListLongToShort();
    }
}