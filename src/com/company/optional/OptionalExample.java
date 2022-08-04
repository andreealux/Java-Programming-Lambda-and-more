package com.company.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        Optional<Integer> checkNullInt = Optional.ofNullable(numbers[1]);
        int result = checkNullInt.isPresent() ? checkNullInt.get() : -1;
        System.out.println("result = " + result);
    }
}
