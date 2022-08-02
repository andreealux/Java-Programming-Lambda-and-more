package com.company.streams;

import com.company.functionalProgramming.Instructor;
import com.company.functionalProgramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        //creating a map of names and courses of instructors who teach
        //online and have more than 10 years of experience

        Predicate<Instructor> p1 = (i) -> i.isOnlineCourses();
        Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience()>10;

        List<Instructor> list = Instructors.getAll();

        Map<String, List<String>> map = list.stream()
                .filter(p1)
                .filter(p2)
                .peek(s-> System.out.println(s))
                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));

        System.out.println(map);
    }
}
