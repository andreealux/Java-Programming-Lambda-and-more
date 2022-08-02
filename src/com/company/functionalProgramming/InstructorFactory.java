package com.company.functionalProgramming;

import java.util.List;

public interface InstructorFactory {
    public abstract Instructor getInstructor(String name, int yearsOfExperience, String title, String gender, boolean onlineCourses, List<String> courses);

}
