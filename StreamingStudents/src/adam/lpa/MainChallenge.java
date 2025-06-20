package adam.lpa;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainChallenge {

    public static void main(String[] args) {

        Course pymc= new Course("PYMC", "Python Masterclass",50);
        Course jmc= new Course("JMC", "Java Masterclass", 100);
        Course cgij= new Course("CGIJ", "Creating games in Java");

        List<Student> students = Stream.generate(() -> Student.getRandomStudent(pymc, jmc, cgij))
                .limit(5000)
                .toList();

        double avgPercentCompleteJMC = students.stream()
                .reduce(0.0,
                        (sum, student) -> sum + student.getPercentComplete(jmc.courseCode()),
                        Double::sum) / students.size();

        System.out.printf("Priemerné percento dokončenia Java Masterclass: %.2f%%\n", avgPercentCompleteJMC);

        double vynasobenyPriemer = avgPercentCompleteJMC * 1.25;

        System.out.println("Priemer po vynásobení 1.25 je = " + vynasobenyPriemer);

        Set<Student> topStudenti = (Set<Student>) students.stream()
                .filter((student) -> student.getPercentComplete(jmc.courseCode()) > vynasobenyPriemer)
                .sorted(Comparator.comparing(Student::getYearsSinceEnrolled).reversed())
                .limit(10)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        for (Student s : topStudenti) {
            System.out.println(s.getStudentId() + " " + s.getPercentComplete(jmc.courseCode()) + " " +  s.getYearsSinceEnrolled());
        }

    }
}

//UDEMY




//public class MainChallenge {
//
//    public static void main(String[] args) {
//
//        Course pymc= new Course("PYMC", "Python Masterclass", 50);
//        Course jmc= new Course("JMC", "Java Masterclass", 100);
//        Course jgames = new Course("JGAME", "Creating games in Java");
//
//        List<Student> students = IntStream
//                .rangeClosed(1, 5000)
//                .mapToObj(s -> Student.getRandomStudent(jmc, pymc))
//                .toList();
//
//        double totalPercent = students.stream()
//                .mapToDouble(s -> s.getPercentComplete("JMC"))
//                .reduce(0, Double::sum);
//
//        double avePercent = totalPercent / students.size();
//        System.out.printf("Average Percentage Complete = %.2f%% %n", avePercent);
//
//        int topPercent = (int) (1.25 * avePercent);
//        System.out.printf("Best Percentage Complete = %d%% %n", topPercent);
//
//        Comparator<Student> longTermStudent
//                = Comparator.comparing(Student::getYearEnrolled);
//
//        List<Student> hardWorkers = students.stream()
//                .filter(s -> s.getMonthsSinceActive("JMC") == 0)
//                .filter(s -> s.getPercentComplete("JMC") >= topPercent)
//                .sorted(longTermStudent)
//                .limit(10)
//                .toList();
//
//        hardWorkers.forEach(s -> {
//            s.addCourse(jgames);
//            System.out.print(s.getStudentId() + " ");
//        });
//
//        System.out.println();
//
//        Comparator<Student> uniqueSorted = longTermStudent.thenComparing(
//                Student::getStudentId);
//
//        students.stream()
//                .filter(s -> s.getMonthsSinceActive("JMC") == 0)
//                .filter(s -> s.getPercentComplete("JMC") >= topPercent)
//                .sorted(longTermStudent)
//                .limit(10)
////                .toList()
////                .collect(Collectors.toList())
////                .collect(Collectors.toSet())
////                .collect(() -> new TreeSet<>(uniqueSorted),
////                    TreeSet::add, TreeSet::addAll)
//                .forEach(s -> {
//                    s.addCourse(jgames);
//                    System.out.print(s.getStudentId() + " ");
//                });
//
//    }
//}
