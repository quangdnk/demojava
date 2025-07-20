package com.example.myapplication;

public class BadCodeExample {
    public static void main(String[] args) {
        System.out.println("Start");
        BadCodeExample example = new BadCodeExample();
        example.doSomething(5);
        example.doSomething(0);
    }

    public void doSomething(int value) {
        if (value == 0) {
            int result = 10 / value; // lỗi chia cho 0
            System.out.println("Result: " + result);
        } else if (value == 5) {
            System.out.println("Five");
        } else if (value == 5) { // duplicated condition
            System.out.println("Still Five");
        } else {
            System.out.println("Value: " + value);
        }
    }

    public void unusedMethod() {
        String s = "This method is never used";
    }
}
