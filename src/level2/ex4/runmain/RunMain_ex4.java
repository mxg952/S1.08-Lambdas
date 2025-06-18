package level2.ex4.runmain;

import level2.ex3.functionalinterface.Operation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunMain_ex4 {
    ArrayList<String> stringAndInt;

    public RunMain_ex4() {
        this.stringAndInt = new ArrayList<>();
    }

    public void loadCollection(){
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
    }

    public void sortListByFirstCaracter() {
        List<String> sortedList = this.stringAndInt.stream()
                .sorted(Comparator.comparing(s -> s.charAt(0))).toList();
        System.out.println("Sorted by firt caracter: " + sortedList);
    }

    public void sortedByFirstCaracterE() {
        List<String> sortedList = this.stringAndInt.stream()
                .sorted((Comparator.comparingInt((String s) -> s.toLowerCase().contains("e") ? 0 : 1)
                        .thenComparingInt(s -> s.toLowerCase().indexOf("e")))).toList();
        System.out.println("Sorted by first caracter letther E: " + sortedList);
    }

    public void changeAfor4() {
        List<String> resultList = this.stringAndInt.stream()
                .map(s -> s.replace('a', '4')).toList();
        System.out.println("Change 'a' caracters for '4' : " + resultList);
    }

    public void justPritnNumbers() {
        List<String> numberList = this.stringAndInt.stream()
                .filter(s -> s.matches("\\d+")).toList();
        System.out.println("Just print numbers of the list: " + numberList);
    }

}
