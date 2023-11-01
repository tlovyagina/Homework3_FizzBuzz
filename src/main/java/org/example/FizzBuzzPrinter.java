package org.example;

public class FizzBuzzPrinter {
    public void print() {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i + ": FizzBuzz");
            else if (i % 3 == 0)
                System.out.println(i + ": fizz");
            else if (i % 5 == 0)
                System.out.println(i + ": buzz");
        }
    }
}