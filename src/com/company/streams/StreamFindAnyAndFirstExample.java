package com.company.streams;

import com.company.functionalProgramming.Instructor;
import com.company.functionalProgramming.Instructors;

import java.util.Optional;

public class StreamFindAnyAndFirstExample {
    public static void main(String[] args) {
        Optional<Instructor> instructor = Instructors.getAll().stream()
                .findAny();
        if(instructor.isPresent())
            System.out.println(instructor.get());

        instructor = Instructors.getAll().stream().findFirst();
        if(instructor.isPresent())
            System.out.println(instructor.get());
    }
}
