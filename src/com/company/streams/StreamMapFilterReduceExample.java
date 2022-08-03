package com.company.streams;

import com.company.functionalProgramming.Instructor;
import com.company.functionalProgramming.Instructors;

public class StreamMapFilterReduceExample {
    public static void main(String[] args) {
        //total years of experience between the instructors
        int result = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .map(Instructor::getYearsOfExperience)
                .reduce(0,Integer::sum);
        System.out.println(result);
    }
}
