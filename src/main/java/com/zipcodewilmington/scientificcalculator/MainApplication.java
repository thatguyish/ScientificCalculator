package com.zipcodewilmington.scientificcalculator;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Console.println("Welcome to my calculator!");
        Pattern numberPattern = Pattern.compile("[,\\d]+");
        Matcher matches = numberPattern.matcher("");
        calculator.showDisplay();
        while(calculator.isActive){

            String userInput = Console.getStringInput("Enter an Operation");
            Double numberInput = 0d;
            if (matches.reset(userInput).matches()){
                numberInput = Double.parseDouble(userInput);
                userInput = "number";
            }
            switch (userInput){
                case "number":
                    calculator.updateCalculator(numberInput);
                    break;
                case "clear":
                    calculator.clearDisplay();
                    break;
                case "display":
                    calculator.showDisplay();
                    break;
                case "add":
                    Double numberToAdd = Console.getDoubleInput("Enter a number to add");
                    calculator.calculate("addition",numberToAdd);
                    break;
                case "subtract":
                    Double numberToSubtract = Console.getDoubleInput("Enter a number to subtract");
                    calculator.calculate("subtraction",numberToSubtract);
                    break;
                case "multiply":
                    Double numberToMultiply = Console.getDoubleInput("Enter a number to multiply");
                    calculator.calculate("multiplication",numberToMultiply);
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
