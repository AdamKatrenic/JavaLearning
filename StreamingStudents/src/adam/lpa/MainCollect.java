package adam.lpa;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainCollect {

    public static void main(String[] args) {

        Course pymc= new Course("PYMC", "Python Masterclass");
        Course jmc= new Course("JMC", "Java Masterclass");

        List<Student> students = Stream.generate(() -> Student.getRandomStudent(pymc, jmc))
                .limit(1000)
                .toList();

        Set<Student> slovakStudents = students.stream()
                .filter((s) -> s.getCountryCode().equals("SK"))
                .collect(Collectors.toSet());
        System.out.println("# of Slovak students: " + slovakStudents.size());

        Set<Student> underThirty = students.stream()
                .filter((s) -> s.getAgeEnrolled() < 30)
                .collect(Collectors.toSet());
        System.out.println("# of Under 30 students: " + underThirty.size());

        Set<Student> youngSlovaks = new TreeSet<>(Comparator.comparing(Student::getStudentId));
        youngSlovaks.addAll(slovakStudents);
        youngSlovaks.retainAll(underThirty);
        youngSlovaks.forEach((s) -> System.out.print(s.getStudentId() + " "));
        System.out.println();

        Set<Student> youngSlovaks2 = students.stream()
                .filter((s) -> s.getAgeEnrolled() < 30)
                .filter((s) -> s.getCountryCode().equals("SK"))
                .collect(()->new TreeSet<>(Comparator.comparing(Student::getStudentId)), TreeSet::add, TreeSet::addAll);

        youngSlovaks2.forEach((s) -> System.out.print(s.getStudentId() + " "));
        System.out.println();

        String countryList = students.stream()
                .map(Student::getCountryCode)
                .distinct()
                .sorted()
                .reduce("",(r,v) -> r + " " + v);
        System.out.println("countryList = " + countryList);


    }
}
