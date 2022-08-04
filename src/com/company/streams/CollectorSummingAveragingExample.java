package com.company.streams;

import com.company.functionalProgramming.Instructor;
import com.company.functionalProgramming.Instructors;

import java.util.stream.Collectors;

public class CollectorSummingAveragingExample {
    public static void main(String[] args) {
        //sum experience
        int sum = Instructors.getAll().stream()
                .collect(Collectors.summingInt(Instructor::getYearsOfExperience));
        System.out.println("sum = " + sum);

        double average = Instructors.getAll().stream()
                .collect(Collectors.averagingInt(Instructor::getYearsOfExperience));
        System.out.println("average = " + average);
    }
}
