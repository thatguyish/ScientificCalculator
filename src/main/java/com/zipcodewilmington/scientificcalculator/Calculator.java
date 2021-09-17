package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    //property when there is an error set true
    private boolean error = false;

    //gets error property
    public boolean isErrored(){
        return this.error;
    }

    //sets calculator to error state
    private void errorCalculator(){
        this.onDisplay="Err";
        this.error = true;
    }

    //value representing the display
    private String onDisplay = "0";

    private void setOnDisplay(String displayVal){
        this.onDisplay = displayVal;
    }

    private String getOnDisplay(){
        return this.onDisplay;
    }

    //display the value in the display property
    public void showDisplay(){
        System.out.println(this.getOnDisplay());
    }

    //clears the calculators display
    public void clearDisplay(){
        this.updateCalculator(0d);
        this.error = false;
    }

//    private String mode = ["binary"]

    //some memory for the calculator to store a value
    private double memory = 0d;

    //property defining activity
    private boolean isActive = true;

    //gets isActive property
    public boolean isActive(){
        return this.isActive;
    }

    //sets isActive property
    private void setIsActive(boolean activeness){
        this.isActive = activeness;
    }

    //update calculator display
    public void updateCalculator(Double val){
        if (Double.isNaN(val) || Double.isInfinite(val)){
            this.errorCalculator();
        }else{
            this.setOnDisplay(String.valueOf(val));
        }
    }

    //Shuts down calculator
    public void shutDown(){
        this.setOnDisplay("Powering Off");
        this.setIsActive(false);
    }

    //calculates and updates display
    public void calculate(String operator,double val){
        double valOnCalc = Double.parseDouble(this.getOnDisplay());

        switch (operator){
            case "addition":
                double sum = valOnCalc + val;
                updateCalculator(sum);
                break;
            case "subtraction":
                double subtractedVal = valOnCalc - val;
                updateCalculator(subtractedVal);
                break;
            case "multiplication":
                double multipliedVal = valOnCalc * val;
                updateCalculator(multipliedVal);
                break;
            case "division":
                double dividedVal = valOnCalc/val;
                updateCalculator(dividedVal);
                break;
            case "squareroot":
                double squareRootedVal = Math.sqrt(valOnCalc);
                updateCalculator(squareRootedVal);
                break;
            case "square":
            case "exponentiation":
                double exponentiatedVal = Math.pow(valOnCalc,val);
                updateCalculator(exponentiatedVal);
                break;
            case "inverse":
                double inversedVal = 1/valOnCalc;
                updateCalculator(inversedVal);
                break;
            case "invert":
                double invertedVal = valOnCalc*-1;
                updateCalculator(invertedVal);
                break;
            default:
                break;
        }


    }

}
