package com.company.functionalProgramming;

import java.util.function.IntConsumer;

public class VariableScope {
    static int k = 0;

    public static void main(String[] args) {
        int b = 10; //local variable
        IntConsumer intConsumer = (a) -> System.out.println(a * 10);

        Instructors.getAll().forEach(instructor -> {
            System.out.println(instructor + " " + k++);
        });
    }
}
