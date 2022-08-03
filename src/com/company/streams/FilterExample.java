package com.company.streams;

import com.company.functionalProgramming.Instructor;
import com.company.functionalProgramming.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        //returning instructors sorted by their name and have more than 10 years of experience
        List<Instructor> list = Instructors.getAll().stream()
                .filter(instructor -> instructor.getYearsOfExperience()>10)
                .sorted(Comparator.comparing(Instructor::getName))
                .collect(Collectors.toList());

        list.forEach(System.out::println);


    }
}
