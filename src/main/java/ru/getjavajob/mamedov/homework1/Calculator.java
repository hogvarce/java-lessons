package ru.getjavajob.mamedov.homework1;

/**
 * Created by Ganzhenko on 19.09.2016.
 */
public class Calculator {
    private static double firstNum, secondNum;
    private String operation;
    private static boolean firstNumisSet;
    static {
        firstNum = 0;
        secondNum = 0;
        firstNumisSet = false;
    }
    public void setNum(double num) {
        if (firstNumisSet) {
            secondNum = num;
        } else {
            firstNum = num;
            firstNumisSet = true;
        }
    }
    public void reset() {
        firstNum = 0;
        secondNum = 0;
        firstNumisSet = false;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }
    public double getAnswer() {
        if (firstNumisSet) {
            switch (this.operation) {
                case "/":
                    firstNum = firstNum / secondNum;
                    break;
                case "*":
                    firstNum = firstNum * secondNum;
                    break;
                case "-":
                    firstNum = firstNum - secondNum;
                    break;
                case "+":
                    firstNum = firstNum + secondNum;
                    break;
            }
        }
        return firstNum;
    }
}
