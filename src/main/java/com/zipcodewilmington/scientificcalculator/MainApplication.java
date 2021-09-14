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
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an Operation");
            String userInput = scanner.nextLine();

            switch (userInput){
                case "add":
                    Double numberToAdd = Console.getDoubleInput("Enter a number to add");
                    calculator.calculate("addition",numberToAdd);

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
