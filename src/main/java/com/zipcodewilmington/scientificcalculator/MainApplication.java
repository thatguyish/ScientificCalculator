package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Console.println("Welcome to my calculator!");
        while(calculator.isActive){
            calculator.showDisplay();

            String userInput = Console.getStringInput("Enter an Operation");

            switch (userInput){
                case "add":
                    Double numberToAdd = Console.getDoubleInput("Enter a number to add");
                    Calculator.calculate("addition",numberToAdd);
                    break;
                case "subtract":
                    Double numberToSubtract = Console.getDoubleInput("Enter a number to subtract");
                    Calculator.calculate("subtraction",numberToSubtract);
                    break;
            }
//            String s = Console.getStringInput("Enter a string");
//            Integer i = Console.getIntegerInput("Enter an integer");
//            Double d = Console.getDoubleInput("Enter a double.");
//
//            Console.println("The user input %s as a string", s);
//            Console.println("The user input %s as a integer", i);
//            Console.println("The user input %s as a d", d);
        }
    }
}
