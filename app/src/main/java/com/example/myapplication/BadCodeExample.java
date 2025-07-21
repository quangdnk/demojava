package com.example.myapplication;

public class BadCodeExample {

    public static void main(String[] args) {
        System.out.println("Start");
        BadCodeExample example = new BadCodeExample();
        example.doSomething(5);
        example.doSomething(0);

        System.out.println("Starting..."); // ❌ Sonar: Avoid using System.out

        String unusedVariable = "I am not used"; // ❌ Sonar: Remove unused variables

        for (int i = 0; i < 10; i++) {
            if (i == 1 || i == 1) { // ❌ Sonar: Duplicated condition
                System.out.println("Bad condition"); // ❌ Again: System.out
            }
        }

        calculate();
    }

    public void doSomething(int value) {
        if (value == 0) {
            System.out.println("Cannot divide by zero.");
        } else if (value == 5) {
            System.out.println("Five");
        } else {
            System.out.println("Value: " + value);
        }
    }

    public void unusedMethod() {
        String s = "This method is never used";
    }

    public static void calculate() {
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result += i;
        }
        System.out.println("Result: " + result); // ❌ Hardcoded logging
    }
}
