package com.company.functionalProgramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    public static void main(String[] args) {
        //Bifunction 2 inputs List<Instructor> and second argument is a predicate wich will filter if instructors has online
        //courses and return a map of <String, Integer> string is name and Integer is the years of experiance

        Predicate<Instructor> p1 = (i) -> i.isOnlineCourses() == true;
        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String,Integer>> mapBiFunction = ((instructors, instructorPredicate) -> {
            Map<String,Integer> map = new HashMap<>();
            instructors.forEach(instructor -> {
                if(instructorPredicate.test(instructor)){
                    map.put(instructor.getName(), instructor.getYearsOfExperience());
                }
            });
            return map;
        });
        System.out.println(mapBiFunction.apply(Instructors.getAll(),p1));
    }
}
