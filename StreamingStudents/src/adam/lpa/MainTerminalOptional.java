package adam.lpa;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MainTerminalOptional {

    public static void main(String[] args) {

        Course pymc= new Course("PYMC", "Python Masterclass");
        Course jmc= new Course("JMC", "Java Masterclass");

        List<Student> students = Stream.generate(() -> Student.getRandomStudent(pymc, jmc))
                .limit(1000)
                .toList();

        int minAge = 18;

        students.stream()
                .filter((s) -> s.getAge() <= minAge)
                .findAny()
                .ifPresentOrElse(s -> System.out.printf("Student %d from %s is %d%n", s.getStudentId(), s.getCountryCode(), s.getAge()),
                        () -> System.out.println("Didn't find anyone under " + minAge));

        students.stream()
                .filter((s) -> s.getAge() <= minAge)
                .findFirst()
                .ifPresentOrElse(s -> System.out.printf("Student %d from %s is %d%n", s.getStudentId(), s.getCountryCode(), s.getAge()),
                        () -> System.out.println("Didn't find anyone under " + minAge));

        students.stream()
                .filter((s) -> s.getAge() <= minAge)
                .min(Comparator.comparing(Student::getAge))
                .ifPresentOrElse(s -> System.out.printf("Student %d from %s is %d%n", s.getStudentId(), s.getCountryCode(), s.getAge()),
                        () -> System.out.println("Didn't find anyone under " + minAge));

        students.stream()
                .filter((s) -> s.getAge() <= minAge)
                .max(Comparator.comparing(Student::getAge))
                .ifPresentOrElse(s -> System.out.printf("Student %d from %s is %d%n", s.getStudentId(), s.getCountryCode(), s.getAge()),
                        () -> System.out.println("Didn't find anyone under " + minAge));

        students.stream()
                .filter((s) -> s.getAge() <= minAge)
                .mapToInt(Student::getAge)
                .average()
                .ifPresentOrElse(value -> System.out.printf("Avg age under 21: %.2f%n", value),
                        ()-> System.out.println("Did not find anyone under " + minAge));

        students.stream()
                .filter((s) -> s.getAge() <= minAge)
                .map(Student::getCountryCode)
                .distinct()
                .reduce((a, b) -> String.join(",", a, b))
                .ifPresentOrElse(System.out::println, () -> System.out.println("None found"));

        students.stream()
                .map(Student::getCountryCode)
                .distinct()
                .findAny()
                .map(l -> String.join(",", l))
                .filter(l -> l.contains("SK"))
                .ifPresentOrElse(System.out::println, () -> System.out.println("Missing SK"));

    }
}
