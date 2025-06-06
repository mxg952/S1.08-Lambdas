package level2.AllExercices;

import level2.AllExercices.model.LambdaMethodsLevel2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> stringAndInt = new ArrayList<>();
        LambdaMethodsLevel2 lambdaMethods = new LambdaMethodsLevel2();

        names.add("Ari");
        names.add("Adri");
        names.add("Marc");
        names.add("Andrea");
        names.add("Ana");
        names.add("Pablo");
        names.add("Altay");

        numbers.add(1);
        numbers.add(80);
        numbers.add(17434);
        numbers.add(13);
        numbers.add(54343);

        stringAndInt.add("Marc");
        stringAndInt.add("33434");
        stringAndInt.add("Mario");
        stringAndInt.add("4444555");
        stringAndInt.add("Anna");
        stringAndInt.add("Begonya");
        stringAndInt.add("Nuria");
        stringAndInt.add("1");
        stringAndInt.add("Helena");
        stringAndInt.add("Esteban");
        stringAndInt.add("Ernesto");

        System.out.println("\nExercice 1:");
        lambdaMethods.filterNames(names);

        System.out.println("\nExercice 2:");
        lambdaMethods.filterIntegers(numbers);

        System.out.println("\nExercice 3:");
        lambdaMethods.operationSum(3, 5);
        lambdaMethods.operationSubstraccion(3, 5);
        lambdaMethods.operationMultiplication(3, 5);
        lambdaMethods.operationDivision(3, 5);

        System.out.println("\nExercice 4:");
        lambdaMethods.sortListByFirstCaracter(stringAndInt);
        lambdaMethods.sortedByFirstCaracterE(stringAndInt);
        lambdaMethods.changeAfor4(stringAndInt);
        lambdaMethods.justPritnNumbers(stringAndInt);


    }
}