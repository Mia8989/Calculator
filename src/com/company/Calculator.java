package com.company;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        return (double) num1 / (double) num2;
    }

    public int square(int num) {
        return (int) Math.pow(num, 2);
    }
}
//    private void add(int num1, int num2){}
//    private void substract(int num1, int num2){}
//    private void multiply(int num1, int num2){}
//    private void divide (int num1, int num2){}
//    private void square(int num){}

