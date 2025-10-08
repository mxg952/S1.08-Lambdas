package level1.ex8.main;

import level1.ex8.functionalinterface.StringReverser;

import java.util.stream.IntStream;

public class Main_ex8 {
    public static void main(String[] args) {

        String textToRevers = "Supercalifragilisticoespialidoso";
        String textToRevers2 = "Magic";


        StringReverser reverser = (text) -> {
           StringBuilder sb = new StringBuilder(text);
           return sb.reverse().toString();
        };

        System.out.println(reverser.reverse(textToRevers));


        StringReverser reverser1 = (String text2) ->  {
            StringBuilder sb = new StringBuilder();
            IntStream.iterate(text2.length() - 1, i -> i >= 0, i -> i - 1)
                    .forEach(i -> sb.append(text2.charAt(i)));
            return sb.toString();
        };

        System.out.println(reverser1.reverse(textToRevers2));
    }
}