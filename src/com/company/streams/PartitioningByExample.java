package com.company.streams;

import com.company.functionalProgramming.Instructor;
import com.company.functionalProgramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitioningByExample {
    public static void main(String[] args) {
        //partition instructors in two groups of instructors
        //first is year of experiance>10 an other is  <=10
        Predicate<Instructor> experiancePredicate = instructor ->
                instructor.getYearsOfExperience()>10;

        Map<Boolean, List<Instructor>> partitionMap = Instructors.getAll().stream()
                .collect(Collectors.partitioningBy(experiancePredicate));

        partitionMap.forEach((key,value) ->
                System.out.println("key = " + key + " value = " + value));

        System.out.println("----------------------------------");

        //partition but return is set instead of list
        Map<Boolean, Set<Instructor>> partitionSet = Instructors.getAll().stream()
                .collect(Collectors.partitioningBy(experiancePredicate, Collectors.toSet()));

        partitionSet.forEach((key,value) ->
                System.out.println("key = " + key + " value = " + value));
    }
}
