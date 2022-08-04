package com.company.streams;

import com.company.functionalProgramming.Instructor;
import com.company.functionalProgramming.Instructors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMinMaxExample {
    public static void main(String[] args) {
        //instructor with minimum years of experience
        Optional<Instructor> instructor = Instructors.getAll().stream()
                .collect(Collectors.minBy(Comparator.comparing(Instructor::getYearsOfExperience)));

        System.out.println("instructor = " + instructor);
        System.out.println("---------------------------------");
        instructor = Instructors.getAll().stream()
                .min(Comparator.comparing(Instructor::getYearsOfExperience));

        System.out.println("instructor = " + instructor);

        System.out.println("---------------------------------");
        //instructor with max years of experience
        Optional<Instructor> instructor1 = Instructors.getAll().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)));

        System.out.println("instructor = " + instructor1);
        System.out.println("---------------------------------");
        instructor1 = Instructors.getAll().stream()
                .max(Comparator.comparing(Instructor::getYearsOfExperience));

        System.out.println("instructor = " + instructor1);
    }
}
