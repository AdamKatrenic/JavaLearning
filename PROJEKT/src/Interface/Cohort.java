package Interface;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    String name;

    List<Student> studentList;

    List<Mentor> mentorList;

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentorList.add(mentor);
    }

    public void info(){
        System.out.println("The " + name + " cohort has " + studentList.size() + " students and " +
                mentorList.size() + " mentors");
    }

    public Cohort(String name) {
        this.name = name;
        this.studentList = new ArrayList<>();
        this.mentorList = new ArrayList<>();
    }

}
