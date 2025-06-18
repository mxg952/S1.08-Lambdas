package level2.ex3.runmain;

import level2.ex3.functionalinterface.Operation;

import java.util.ArrayList;
import java.util.List;

public class RunMain_ex3 {
    private float a = 3 , b = 5;

    public RunMain_ex3() {
    }

    public void operationSum() {
        Operation sum = (num1, num2) -> num1 + num2;
        System.out.println("Sum result: " + sum.operation(a, b));
    }

    public void operationSubstraccion() {
        Operation substraction = (num1, num2) -> num1 - num2;
        System.out.println("Subtraction result: " + substraction.operation(a, b));
    }

    public void operationMultiplication() {
        Operation multiplication = (num1, num2) -> num1 * num2;
        System.out.println("Multiplication result: " + multiplication.operation(a, b));
    }

    public void operationDivision() {
        Operation division = (num1, num2) -> num1 / num2;
        System.out.println("Division result: " + division.operation(a, b));
    }
}
