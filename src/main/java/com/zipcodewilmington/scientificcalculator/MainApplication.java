package com.zipcodewilmington.scientificcalculator;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        //calculator setup
        Calculator calculator = new Calculator();

        //number recognition set up
        Pattern numberPattern = Pattern.compile("[,\\d]+");
        Matcher matches = numberPattern.matcher("");

        //display calculator
        Console.println("Welcome to my calculator!");
        calculator.showDisplay();

        //Main while loop continues running application until off
        while(calculator.isActive()){

            //Enter command/ value/ operation in text form
            String userInput = Console.getStringInput("Enter an Operation/Command/or Number");
            double numberInput = 0d;

            //check if value is a number
            if (matches.reset(userInput).matches()){
                numberInput = Double.parseDouble(userInput);
                userInput = "number";
            }

            //check if there is an error
            if(calculator.isErrored() && !userInput.equals("clear")){
                userInput = "";
            }

            //all available commands/ operations
            switch (userInput){
                case "power off":
                    calculator.setIsActive(false);
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
                    Double numberToAdd = Console.getDoubleInput("Enter a number to add by");
                    calculator.calculate("addition",numberToAdd);
                    break;
                case "subtract":
                    Double numberToSubtract = Console.getDoubleInput("Enter a number to subtract by");
                    calculator.calculate("subtraction",numberToSubtract);
                    break;
                case "multiply":
                    Double numberToMultiply = Console.getDoubleInput("Enter a number to multiply by");
                    calculator.calculate("multiplication",numberToMultiply);
                    break;
                case "divide":
                    Double numberToDivide = Console.getDoubleInput("Enter a number to divide by");
                    calculator.calculate("division",numberToDivide);
                    break;
                case "square":
                    calculator.calculate("square",2);
                    break;
                case "squareroot":
                    calculator.calculate("squareroot",0);
                    break;
                case "exponent":
                    Double valToExponentiateBy = Console.getDoubleInput("Enter exponent");
                    calculator.calculate("exponentiation",valToExponentiateBy);
                    break;
                case "inverse":
                    calculator.calculate("inverse",0);
                    break;
                case "invert":
                    calculator.calculate("invert",0);
                    break;
                default:
                    break;
            }
            calculator.showDisplay();
        }
    }
}
