package com.company.streams;

import com.company.functionalProgramming.Instructor;
import com.company.functionalProgramming.Instructors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningCountingExample {
    public static void main(String[] args) {
        String result = Stream.of("E","F","G","H").collect(Collectors.joining());
        System.out.println(result);

        result = Stream.of("E","F","G","H").collect(Collectors.joining(","));
        System.out.println(result);

        result = Stream.of("E","F","G","H").collect(Collectors.joining(",","{","}"));
        System.out.println(result);

        //instructors names separeted by ' prefix { and sufix }
        String namesConcatenated = Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.joining(",","{","}"));
        System.out.println("namesConcatenated = " + namesConcatenated);


        System.out.println("-------------------------------");
        //count the numbers of instructors who teach online courses
        //stream.count
        long count = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .count();
        System.out.println(count);

        //colletors.counting
        count = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .collect(Collectors.counting());
        System.out.println(count);

    }
}
