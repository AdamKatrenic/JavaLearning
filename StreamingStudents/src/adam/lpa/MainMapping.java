package adam.lpa;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;


public class MainMapping {

    public static void main(String[] args) {

        Course pymc= new Course("PYMC", "Python Masterclass",50);
        Course jmc= new Course("JMC", "Java Masterclass", 100);
        Course cgij= new Course("CGIJ", "Creating games in Java");

        List<Student> students = IntStream
                .rangeClosed(1, 5000)
                .mapToObj(s -> Student.getRandomStudent(jmc,pymc))
                .toList();

        var mappedStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getCountryCode));

        mappedStudents.forEach((k,v)-> System.out.println(k + " " + v.size()));

        System.out.println("-".repeat(100));

        int minAge = 25;

        var youngerSet = students.stream()
                .collect(groupingBy(Student::getCountryCode, filtering(s ->  s.getAge() <= minAge, toList())));

        youngerSet.forEach((k,v)-> System.out.println(k + " " + v.size()));

        System.out.println("-".repeat(100));

        var experienced = students.stream()
                .collect(partitioningBy(Student::hasProgrammingExperience));
        System.out.println("Experienced Students = " + experienced.get(true).size());

        System.out.println("-".repeat(100));

        var expCount = students.stream()
                .collect(partitioningBy(Student::hasProgrammingExperience, counting()));
        System.out.println("Experienced Students = " + expCount.get(true));

        System.out.println("-".repeat(100));

        var experiencedAndActive = students.stream()
                .collect(partitioningBy(s -> s.hasProgrammingExperience()
                        && s.getMonthsSinceActive() == 0,
                        counting()));
        System.out.println("Experienced and Active Students = " + experiencedAndActive.get(true));

        System.out.println("-".repeat(100));

        var multiLevel = students.stream()
                .collect(groupingBy(Student::getCountryCode,
                        groupingBy(Student::getGender)));

        multiLevel.forEach((key,value)-> {
            System.out.println(key);
            value.forEach((key1,value1)-> System.out.println("\t" + key1 + " " + value1.size()));
        });

        System.out.println("-".repeat(100));

        long studentBodyCount = 0;
        for (var list : experienced.values()) {
            studentBodyCount += list.size();
        }
        System.out.println("StudentBodyCount = " + studentBodyCount);

        System.out.println("-".repeat(100));

        studentBodyCount = experienced.values().stream()
                .mapToInt(list -> list.size())
                .sum();
        System.out.println("StudentBodyCount = " + studentBodyCount);

        System.out.println("-".repeat(100));

        studentBodyCount = experienced.values().stream()
                .map(list -> list.stream()
                        .filter(s -> s.getMonthsSinceActive() <= 3)
                        .count()
                )
                .mapToLong(list -> list)
                .sum();
        System.out.println("StudentBodyCount = " + studentBodyCount);

        System.out.println("-".repeat(100));

        long count = experienced.values().stream()
                .flatMap(l -> l.stream())
                .filter(s -> s.getMonthsSinceActive() <= 3)
                .count();
        System.out.println("Active Students = " + count);

        System.out.println("-".repeat(100));

        count = multiLevel.values().stream()
                .flatMap(map -> map.values().stream()
                        .flatMap(l -> l.stream()))
                .filter(s -> s.getMonthsSinceActive() <= 3)
                .count();
        System.out.println("Active Students in multilevel = " + count);

        System.out.println("-".repeat(100));

        count = multiLevel.values().stream()
                .flatMap(map -> map.values().stream())
                .flatMap(l -> l.stream())
                .filter(s -> s.getMonthsSinceActive() <= 3)
                .count();
        System.out.println("Active Students in multilevel = " + count);
    }
}
