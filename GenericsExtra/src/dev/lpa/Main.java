package dev.lpa;

import dev.lpa.model.LPAStudent;
import dev.lpa.model.LPAStudentComparator;
import dev.lpa.model.Student;
import dev.lpa.util.QueryItem;
import dev.lpa.util.QueryList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record Employee(String name)  implements QueryItem {

    @Override
    public boolean matchFieldValues(String fieldName, String value) {
        return false;
    }
}

public class Main {

    public static void main(String[] args) {

        QueryList<LPAStudent> queryList = new QueryList<>();
        for (int i = 0; i < 25; i++) {
            queryList.add(new LPAStudent());
        }

        System.out.println("Ordered");
        queryList.sort(Comparator.naturalOrder());
        printList(queryList);

        System.out.println("Matches");
        var matches = queryList.getMatches("PercentComplete","50")
                .getMatches("Course","Java");

        matches.sort(new LPAStudentComparator());
        printList(matches);

        System.out.println("Ordered");
        matches.sort(null);
        printList(matches);
    }

    public static void printList(List<?>students) {

        for (var student : students) {
            System.out.println(student);
        }
    }

//    public static <T extends Student> void printList(List<T> students){
//
//        for(var student : students){
//            System.out.println(student.getYearStarted() + ": " + student);
//        }
//        System.out.println();
//    }

    public static void printMoreLists(List<? extends Student> students){

        for(var student : students){
            System.out.println(student);
        }
        System.out.println();
    }

//    public static void testList(List<String>list){
//
//        for (var element : list){
//            System.out.println("String: " + element.toUpperCase());
//        }
//    }
//
//    public static void testList(List<Integer>list){
//
//        for (var element : list){
//            System.out.println("Integer: " + element.floatValue());
//        }
//    }

    public static void testList(List<?> list){
        for (var element : list){
            if(element instanceof String s){
                System.out.println("String: " + s.toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());

            }
        }
    }
}
