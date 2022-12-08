package app;

public class Main {

    static int numberOne;

    static int numberTwo;

    static int addOneAndTwo;

    static int multiplyOneAndTwo;

    static int subtractOneAndTwo;

    static int divideOneAndTwo;

    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");

        System.out.println("My app for Users!");

        System.out.println("Version 1.0");

        numberOne = 8;

        System.out.println("Number one is " + numberOne);

        numberTwo = 2;

        System.out.println("Number two is " + numberTwo);

        addOneAndTwo = add(numberOne, numberTwo);

        System.out.println("\nTheir addition is " + addOneAndTwo);

        multiplyOneAndTwo = multiply(numberOne, numberTwo);

        System.out.println("\nTheir multiplication is " + multiplyOneAndTwo);

        subtractOneAndTwo = subtract(numberOne, numberTwo);

        System.out.println("\nTheir subtraction is " + subtractOneAndTwo);

        divideOneAndTwo = divide(numberOne, numberTwo);

        System.out.println("\nTheir division is " + divideOneAndTwo);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
