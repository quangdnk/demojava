package com.example.myapplication;
import java.util.logging.Logger;

public class BadCodeExample {
    private static final Logger logger = Logger.getLogger(BadCodeExample.class.getName());

    public static void main(String[] args) {
        System.out.println("Start");
        BadCodeExample example = new BadCodeExample();
        example.doSomething(5); 
        example.doSomething(0);
    }

    public void doSomething(int value) {
        if (value == 0) {
            logger.warning("Cannot divide by zero.");
        } else if (value == 5) {
            logger.warning("Five");
        } else {
            logger.warning("Value: " + value);
        }
    }
}
