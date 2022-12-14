package com.company.streams;

import com.company.functionalProgramming.Instructor;
import com.company.functionalProgramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorMappingExample {
    public static void main(String[] args) {
        //map
        List<String> namesList = Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.toList());
        namesList.forEach(System.out::println);

        System.out.println("------------------------------");
        //mapping
        namesList = Instructors.getAll().stream()
                .collect(Collectors.mapping(Instructor::getName,Collectors.toList()));
        namesList.forEach(System.out::println);

        System.out.println("------------------------------");
        //grouping by Instructors years of experience
        Map<Integer, List<String>> mapYearsOfExperienceAndNames = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getYearsOfExperience,Collectors.mapping(Instructor::getName, Collectors.toList())));
        mapYearsOfExperienceAndNames.forEach((key,value) -> {
            System.out.println("key = " + key + " value = " + value);
        });
    }
}
