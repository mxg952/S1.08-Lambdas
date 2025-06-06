package level1.AllExercices;

import level1.AllExercices.model.LambdaMethods;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("Adios");
        words.add("bye");
        words.add("Ciao");
        words.add("Adeu");
        words.add("Hello");
        words.add("Hola");
        words.add("Murcielago");



        LambdaMethods lambdaMethods = new LambdaMethods();

        lambdaMethods.ofilter(words);
        lambdaMethods.letterFilter(words);

        System.out.println("\nYear month's:");
        lambdaMethods.printYearMonths();

        System.out.println("\nYear month's with method reference:");
        lambdaMethods.printMonthsMethodReference();

        lambdaMethods.getPiValueValue();

        lambdaMethods.sortStringListShortToLong(words);
        lambdaMethods.sortStringListLongToShort(words);
        lambdaMethods.stringReverser("Supercalifragilisticoespialidoso");

    }
}