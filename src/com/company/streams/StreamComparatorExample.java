package com.company.streams;

import com.company.functionalProgramming.Instructor;
import com.company.functionalProgramming.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {
    public static void main(String[] args) {
        //returning all instructors sorted by their name
        List<Instructor> list = Instructors.getAll().stream()
                .sorted(Comparator.comparing(Instructor::getName).reversed())
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
