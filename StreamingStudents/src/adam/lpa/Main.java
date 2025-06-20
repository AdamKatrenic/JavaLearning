package adam.lpa;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        Course pymc = new Course("PYMC", "Python Masterclass");
//        Course jmc = new Course("JMC", "Java Masterclass");
//
////        Student adam = new Student("SK", 2025,23,"M",true,jmc,pymc);
////
////        System.out.println(adam);
////
////        adam.watchLecture("JMC",10,5,2019);
////        adam.watchLecture("PYMC",7,7,2020);
////
////        System.out.println(adam);
//
////        Stream.generate(() -> Student.getRandomStudent(jmc,pymc))
////                .limit(20)
////                .forEach(System.out::println);
//
//        System.out.println("-".repeat(220));
//        System.out.println("List Of All Students: \n");
//
//        Student[] students = new Student[10];
//        Arrays.setAll(students, i -> Student.getRandomStudent(jmc,pymc));
//        Arrays.stream(students).forEach(System.out::println);
//
//        List<Student> studentsList = Arrays.asList(students);
//
//        System.out.println("-".repeat(220));
//
//        long maleCounter = Arrays.stream(students)
//                .filter(student -> student.getGender().equals("M"))
//                .count();
//
//        long femaleCounter = Arrays.stream(students)
//                .filter(student -> student.getGender().equals("F"))
//                .count();
//
//        System.out.println("Gender Counter: \n\nMales = " +maleCounter+"\nFemales = "+femaleCounter  );
//
//        System.out.println("-".repeat(220));
//        System.out.println("Age counter: \n");
//
//        long under30 = 0;
//        long over30less60 = 0;
//        long over60 = 0;
//
//        for (Student student : students) {
//            if(student.getAge() > 30 && student.getAge() <= 60) {
//                over30less60++;
//            }else if(student.getAge() > 60) {
//                over60++;
//            }else  if(student.getAge() <= 30) {
//                under30++;
//            }
//        }
//        System.out.println("Under 30 : " + under30 + "\nOver 30 and less than 60: " + over30less60 + "\nOver 60: " + over60);
//
//        System.out.println("-".repeat(220));
//        System.out.println("Summary Statistics: \n");
//
//        IntSummaryStatistics age = studentsList.stream()
//                .mapToInt(Student::getAge)
//                .summaryStatistics();
//
//        System.out.println("Age : " + age);
//
//        System.out.println("-".repeat(220));
//        System.out.println("What countries are Students from? :\n");
//
//        studentsList.stream().forEach(student -> System.out.println("Student with ID: " + student.getStudentId() + " is from: " + student.getCountryCode()));
//
//        System.out.println("-".repeat(220));
//        System.out.println("Students that have been enrolled for more than 7 years: \n");
//
//        studentsList.stream().forEach(student -> {
//            if (student.getYearsSinceEnrolled() > 7) {
//                System.out.println(
//                        "Student with ID: " + student.getStudentId() +
//                                " is enrolled for more than 7 years: " + student.getYearsSinceEnrolled());
//            }
//        });


        Course pymc= new Course("PYMC", "Python Masterclass");
        Course jmc= new Course("JMC", "Java Masterclass");

        Student[] students = new Student[1000];
        Arrays.setAll(students, (i) -> Student.getRandomStudent(jmc, pymc));

        var maleStudents = Arrays.stream(students)
                .filter(s -> s.getGender().equals("M"));

        System.out.println("# of male students " + maleStudents.count());

        for (String gender : List.of("M", "F", "U")) {
            var myStudents = Arrays.stream(students)
                    .filter(s -> s.getGender().equals(gender));
            System.out.println("# of " + gender + " students " + myStudents.count());
        }

        List<Predicate<Student>> list = List.of(
                (s) -> s.getAge() < 30,
                (Student s) -> s.getAge() >= 30 && s.getAge() < 60
        );

        long total = 0;
        for (int i = 0; i < list.size(); i++) {
            var myStudents = Arrays.stream(students).filter(list.get(i));
            long cnt = myStudents.count();
            total += cnt;
            System.out.printf("# of students (%s) = %d%n",
                    i == 0 ? " < 30" : ">= 30 & < 60", cnt);
        }
        System.out.println("# of students >= 60 = " + (students.length - total));

        var ageStream = Arrays.stream(students).
                mapToInt(Student::getAgeEnrolled);
        System.out.println("Stats for Enrollment Age = " + ageStream.summaryStatistics());

        var currentAgeStream = Arrays.stream(students).
                mapToInt(Student::getAge);
        System.out.println("Stats for Current Age = " + currentAgeStream.summaryStatistics());

        Arrays.stream(students)
                .map(Student::getCountryCode)
                .distinct()
                .sorted()
                .forEach(s ->  System.out.print(s + " "));

        System.out.println();
        boolean longTerm = Arrays.stream(students)
                .anyMatch(s -> (s.getAge() - s.getAgeEnrolled() >= 7) &&
                        (s.getMonthsSinceActive() < 12));
        System.out.println("longTerm students? " + longTerm);

        System.out.println();
        long longTermCount = Arrays.stream(students)
                .filter(s -> (s.getAge() - s.getAgeEnrolled() >= 7) && (s.getMonthsSinceActive() < 12))
                .count();
        System.out.println("longTerm students? " + longTermCount);

        System.out.println();
        var longTimeLearners = Arrays.stream(students)
                .filter(s -> (s.getAge() - s.getAgeEnrolled() >= 7) && (s.getMonthsSinceActive() < 12))
                .filter(s -> !s.hasProgrammingExperience())
                .limit(5)
                .toArray(Student[]::new);

        var learners = Arrays.stream(students)
                .filter(s -> (s.getAge() - s.getAgeEnrolled() >= 7) && (s.getMonthsSinceActive() < 12))
                .filter(s -> !s.hasProgrammingExperience())
                .limit(5)
                .collect(Collectors.toList());

        Collections.shuffle(learners);
    }

}
