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

    //display the value in the display property
    public void showDisplay(){
        System.out.println(onDisplay);
    }

//    private String mode = ["binary"]

    //some memory for the calculator to store a value
    private Double memory = 0d;

    //property defining activity
    private boolean isActive = true;

    //gets isActive property
    public boolean isActive(){
        return this.isActive;
    }

    //sets isActive property
    public void setIsActive(boolean activeness){
        this.isActive = false;
    }

    //update calculator display
    public void updateCalculator(Double val){
        if (Double.isNaN(val) || Double.isInfinite(val)){
            this.errorCalculator();
        }else{
            this.onDisplay = String.valueOf(val);
        }
    }

    //clears the calculators display
    public void clearDisplay(){
        this.updateCalculator(0d);
        this.error = false;
    }



    //calculates and updates display
    public void calculate(String operator,double val){
        double valOnCalc = Double.parseDouble(this.onDisplay);

        switch (operator){
            case "addition":
                Double sum = valOnCalc + val;
                updateCalculator(sum);
                break;
            case "subtraction":
                Double subtractedVal = valOnCalc - val;
                updateCalculator(subtractedVal);
                break;
            case "multiplication":
                Double multipliedVal = valOnCalc * val;
                updateCalculator(multipliedVal);
                break;
            case "division":
                Double dividedVal = valOnCalc/val;
                updateCalculator(dividedVal);
                break;
            case "squareroot":
                Double squareRootedVal = Math.sqrt(valOnCalc);
                updateCalculator(squareRootedVal);
                break;
            case "square":
            case "exponentiation":
                Double exponentiatedVal = Math.pow(valOnCalc,val);
                updateCalculator(exponentiatedVal);
                break;
            case "inverse":
                Double inversedVal = 1/valOnCalc;
                updateCalculator(inversedVal);
                break;
            case "invert":
                Double invertedVal = valOnCalc*-1;
                updateCalculator(invertedVal);
                break;
            default:
                break;
        }


    }

}
