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

        numberTwo = 2;

        addOneAndTwo = add(numberOne, numberTwo);

        System.out.println(addOneAndTwo);

        multiplyOneAndTwo = multiply(numberOne, numberTwo);

        System.out.println(multiplyOneAndTwo);

        subtractOneAndTwo = subtract(numberOne, numberTwo);

        System.out.println(subtractOneAndTwo);

        divideOneAndTwo = divide(numberOne, numberTwo);

        System.out.println(divideOneAndTwo);
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
