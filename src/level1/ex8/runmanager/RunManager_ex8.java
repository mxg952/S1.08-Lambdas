package level1.ex8.runmanager;

import level1.ex8.functionalinterface.StringReverser;

public class RunManager_ex8 {

    private String text = "Supercalifragilisticoespialidoso";

    public RunManager_ex8() {
    }

    public void stringReverser(){
        StringReverser reverser = (text1) -> new StringBuilder(text).reverse().toString();
        String reversedText = reverser.reverse(text);
        System.out.println("Reverded: " + reversedText );
    }
}