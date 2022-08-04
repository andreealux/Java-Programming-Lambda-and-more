package com.company.streams;

import com.company.functionalProgramming.Instructor;
import com.company.functionalProgramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrouppingExample2 {
    public static void main(String[] args) {
        //grouping by length of sting and also check that the names contains e
        //and only return those names which have e in it

        List<String> names = List.of("Sid", "Mike", "Jenny", "Gene", "Rajeev");
        Map<Integer, List<String>> result = names.stream()
                .collect(Collectors.groupingBy(String::length,
                        Collectors.filtering(s->s.contains("e"), Collectors.toList())));
        System.out.println(" result = " + result);

        //instructor groupping them by Senior(>10) and Junior (<10) and filter them on online courses
        Map<String, List<Instructor>> instructorByExpAndOnline = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(instructor -> instructor.getYearsOfExperience()>10 ? "Senior" : "Junior",
                        Collectors.filtering(s->s.isOnlineCourses(),Collectors.toList())));

        instructorByExpAndOnline.forEach((key,value) ->
                System.out.println("key= " + key + " value = " + value));
    }
}
