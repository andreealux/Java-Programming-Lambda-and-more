package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int result = numbers.stream()
                //0+1=1
                //1+2=3
                //3+3=6
                //6+4=10
                //10+5=15
                //15+6=21
                //21+7=28
                //28+8=36
                //36+45
                .reduce(0,(a,b)->a + b);
        System.out.println(result);

        int result1 = numbers.stream()
                .reduce(1,(a,b)->a*b);
        System.out.println(result1);

        Optional result2 = numbers.stream()
                .reduce((a,b) -> a+b);
        if(result2.isPresent())
        System.out.println(result2.get());
    }
}
