package level1.AllExercices.model;

import level1.AllExercices.FunctionalInterface.PiValue;
import level1.AllExercices.FunctionalInterface.StringReverser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaMethods {
    public void ofilter(ArrayList<String> words) {

        List<String> result = words.stream()
                .filter(word -> word.contains("o")).toList();

         System.out.println("Word with 'o': " + result);

    }

    public void letterFilter(ArrayList<String> words) {

        List<String> result = words.stream()
                .filter(word -> word.contains("o") && word.length() > 5).toList();

        System.out.println("Word with 'o' and with more than 5 letters: " + result);

    }

    public void printYearMonths(){
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");

        months.forEach(month -> System.out.println(month));
    }

    public void printMonthsMethodReference() {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");

        months.forEach(System.out::println);
    }

    public void getPiValueValue(){
        PiValue pi = () -> 3.1415;
        System.out.println("Pi value: " + pi.getPiValue());
    }

    public void sortStringListShortToLong(ArrayList<String> words ){
        words.sort((a, b) -> Integer.compare(a.length(), b.length()));

        System.out.println("Sorted by short to long): " + words);
    }

    public void sortStringListLongToShort(ArrayList<String> words ){
        words.sort((a, b) -> Integer.compare(b.length(), a.length()));

        System.out.println("Sorted by long to short): " + words);
    }

    public void stringReverser(String text){

        StringReverser reverser = (text1) -> new StringBuilder(text).reverse().toString();

        String reversedText = reverser.reverse(text);

        System.out.println("Reverded: " + reversedText );
    }











}
