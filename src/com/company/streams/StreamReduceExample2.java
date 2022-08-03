package com.company.streams;

import com.company.functionalProgramming.Instructors;

import java.util.Optional;

public class StreamReduceExample2 {
    public static void main(String[] args) {
        //printing the name of the instructor who has the highest year of experience
        Optional instructor = Instructors.getAll().stream()
                .reduce((s1, s2) -> s2.getYearsOfExperience() > s1.getYearsOfExperience() ? s2: s1);
        if (instructor.isPresent())
            System.out.println(instructor.get());
    }
}
