package ru.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int number) {
        return x + number;
    }

    public static int minus(int number) {
        return x - number;
    }

    public int multiply(int number) {
        return x * number;
    }

    public int divide(int number) {
        return number / x;
    }

    public int sumAllOperation(int number) {
        return sum(number) + minus(number) + multiply(number) + divide(number);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(sum(10));
        System.out.println(minus(2));
        System.out.println(calculator.multiply(3));
        System.out.println(calculator.divide(10));
        System.out.println(calculator.sumAllOperation(10));
    }
}
