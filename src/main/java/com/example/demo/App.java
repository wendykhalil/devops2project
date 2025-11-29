package com.example;

public class Calculator {

    // Unused variable (Sonar issue)
    private int unused = 42;

    // Bad naming + no documentation
    public int add(int a, int b) {
        return a + b;
    }

    // Slow and useless loop (performance issue)
    public int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            try {
                Thread.sleep(5); // bad practice
            } catch (InterruptedException e) {
                // ignored (Sonar issue)
            }
            result += a;
        }
        return result;
    }

    // bug: division by zero not checked
    public int divide(int a, int b) {
        return a / b;
    }
}
