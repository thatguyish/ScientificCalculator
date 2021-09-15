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
                Double sum = Double.parseDouble(onDisplay) + val;
                updateCalculator(sum);
                break;
            case "subtraction":
                Double subtractedVal = Double.parseDouble(onDisplay) - val;
                updateCalculator(subtractedVal);
                break;

        }
    }

    public void showDisplay(){
        System.out.println(onDisplay);
    }
}
