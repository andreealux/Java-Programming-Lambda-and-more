package com.company.streams;

import com.company.functionalProgramming.Instructor;
import com.company.functionalProgramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrouppingByExample1 {
    public static void main(String[] args) {
        //group names by their length
        List<String> names = List.of("Syed", "Mike", "Jenny", "Gene", "Rajeev");
        Map<Integer,List<String>> result = names.stream()
                                    .collect(Collectors.groupingBy(String::length));
        System.out.println("result = " + result);

        System.out.println("------------------------");

        //grouping by instructors by their gender
        Map<String, List<Instructor>> instructorsByGender = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(instructor -> instructor.getGender()));
        instructorsByGender.forEach((key,value)->
                System.out.println("key = " + key + "\n value = " + value));

        System.out.println("------------------------");
        //grouping by experieance where >10 years of experience is classified as senior and others are juniors

        Map<String, List<Instructor>> instructorsByExperience = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(instructor -> instructor.getYearsOfExperience()>10 ? "Senior" : "Junior"));
        instructorsByExperience.forEach((key,value)->
                System.out.println("key = " + key + "\n value = " + value));
    }
}
