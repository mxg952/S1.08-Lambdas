package level2.AllExercices.model;

import level2.AllExercices.FunctionalInterface.Operation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaMethodsLevel2 {

    public void filterNames(ArrayList<String> names) {
        List<String> result = names.stream()
                .filter(name -> name.startsWith("A") && name.length() == 3).toList();
        System.out.println("Names whith first letter 'A' and 3 letters: " + result);
    }

    public void filterIntegers(ArrayList<Integer> numbers) {
        List<String> resultList = numbers.stream()
                .map(number -> number % 2 == 0 ? "e" + number : "o" + number).toList();
        System.out.println("Final list: " + resultList);
    }

    public void operationSum(float a, float b) {
        Operation sum = (num1, num2) -> num1 + num2;
        System.out.println("Sum result: " + sum.operation(a, b));
    }

    public void operationSubstraccion(float a, float b) {
        Operation substraction = (num1, num2) -> num1 - num2;
        System.out.println("Subtraction result: " + substraction.operation(a, b));
    }

    public void operationMultiplication(float a, float b) {
        Operation multiplication = (num1, num2) -> num1 * num2;
        System.out.println("Multiplication result: " + multiplication.operation(a, b));
    }

    public void operationDivision(float a, float b) {
        Operation division = (num1, num2) -> num1 / num2;
        System.out.println("Division result: " + division.operation(a, b));
    }

    public void sortListByFirstCaracter(ArrayList<String> list) {
        List<String> sortedList = list.stream()
                .sorted(Comparator.comparing(s -> s.charAt(0))).toList();
        System.out.println("Sorted by firt caracter: " + sortedList);
    }

    public void sortedByFirstCaracterE(ArrayList<String> list) {
        List<String> sortedList = list.stream()
                .sorted((Comparator.comparingInt((String s) -> s.toLowerCase().contains("e") ? 0 : 1)
                        .thenComparingInt(s -> s.toLowerCase().indexOf("e")))).toList();
        System.out.println("Sorted by first caracter letther E: " + sortedList);
    }

    public void changeAfor4(ArrayList<String> list) {
        List<String> resultList = list.stream()
                .map(s -> s.replace('a', '4')).toList();
        System.out.println("Change 'a' caracters for '4' : " + resultList);
    }

    public void justPritnNumbers(ArrayList<String> list) {
        List<String> numberList = list.stream()
                .filter(s -> s.matches("\\d+")).toList();
        System.out.println("Just print numbers of the list: " + numberList);
    }
}
