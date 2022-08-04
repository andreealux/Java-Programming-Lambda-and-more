package com.company.parallelStream;

import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        System.out.println("sumOfSequentialStream = " + sumOfSequentialStream());
        System.out.println("sumParallelStream = " + sumParallelStream());
    }

    public static int sumOfSequentialStream(){
        return IntStream.rangeClosed(0,50000).sum();
    }

    public  static int sumParallelStream(){
        return IntStream.rangeClosed(0,50000).parallel().sum();
    }
}
