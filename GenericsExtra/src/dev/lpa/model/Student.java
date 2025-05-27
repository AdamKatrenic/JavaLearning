package dev.lpa.model;

import dev.lpa.util.QueryItem;

import java.util.Comparator;
import java.util.Random;

public class Student implements QueryItem,Comparable<Student> {



    @Override
    public boolean matchFieldValues(String fieldName, String value) {

        String fName = fieldName.toUpperCase();
        return switch (fName){
            case "NAME" -> this.name.equalsIgnoreCase(value);
            case "COURSE" -> this.course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            case "studentID" -> studentID == Integer.parseInt(value);
            default ->  false;
        };

    }

    private static int LAST_ID = 10_000;

    private String name;
    private String course;
    private int yearStarted;
    private int studentID;

    protected static Random random = new Random();

    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim","Lea","Adam"};
    private static String[] courses = {"C++","Java","Python","Assembly","JavaScript","C#"};

    public Student(){
        studentID = LAST_ID++;
        int lastNameIndex = random.nextInt(65,91);
        name = firstNames[random.nextInt(7)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(6)];
        yearStarted = random.nextInt(2018,2025);

    }

    @Override
    public String toString() {
        return "%-15d %-15s %-15s %-15d".formatted(studentID,name,course,yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(studentID).compareTo(o.studentID);
    }
}
