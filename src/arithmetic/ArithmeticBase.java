/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/**
 * This class takes String input plus,minus,divide and times from user and
 * execute the arithmetic operation change the code to use enum instead String
 * and add object oriented principles satisfy as comment in the code
 * @modifier Josephine Bonsu
 * object principles used include encapsulation, high cohesion and loose coupling
 *
 * @author sivagamasrinivasan date 02/19
 */
public class ArithmeticBase {

    public enum Numbers {X, Y};
    public enum Operators {PLUS, MINUS, TIMES, DIVIDE}
    private final Numbers numbers;
    private final Operators operators;

    ArithmeticBase(Numbers n, Operators o) {
        numbers = n;
        operators = o;
    }
    public Numbers getNumbers(){
    return this.numbers;
    }
    public Operators getOperators(){
    return this.operators;
    }
    double calculate(double X, double Y) 
        {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter String");
        String s= sc.next();
        switch (s.toUpperCase()) 
        {
            case "PLUS":
                return X + Y;
            case "MINUS":
                return X - Y;
            case "TIMES":
                return X * Y;
            case "DIVIDE":
                return X / Y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }

}
 