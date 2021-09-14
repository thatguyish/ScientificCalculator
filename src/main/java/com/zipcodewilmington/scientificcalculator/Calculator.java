package com.zipcodewilmington.scientificcalculator;

public class Calculator {

    private static String onDisplay = "0";

    private static int memory = 0;

    public boolean isActive = true;

    public static void updateCalculator(Double val){
        onDisplay = String.valueOf(val);
    }

    public static void calculate(String operator,double val){
        switch (operator){
            case "addition":
                Double sum = val + Double.parseDouble(onDisplay);
                updateCalculator(sum);
                break;
        }
    }

    public static void showDisplay(){
        System.out.println(onDisplay);
    }
}
