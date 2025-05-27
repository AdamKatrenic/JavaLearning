package dev.lpa;

import dev.lpa.domain.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Minnie", "Mouse", "01/02/2015");
        Employee e2 = new Employee("Mickie", "Mouse", "05/08/2000");
        Employee e3 = new Employee("Daffy", "Duck", "11/02/2011");
        Employee e4 = new Employee("Daisy", "Duck", "05/03/2013");
        Employee e5 = new Employee("Goofy", "Dog", "23/07/2020");

        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

        printOrderedList(list,"name");

        System.out.println();

        printOrderedList(list,"year");
    }

    public static void printOrderedList(List<Employee> eList,String sortField) {

        int currentYear = LocalDate.now().getYear();

        class myEmployee {
            Employee containedEmployee;
            int yearsWorked;
            String fullName;

            public myEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                yearsWorked = currentYear - Integer.parseInt(containedEmployee.hireDate()
                        .split("/")[2]);
                fullName= String.join("",containedEmployee.first(),containedEmployee.last());
            }

            public String toString() {
                return "%s has been an employee for %d years".formatted(fullName, yearsWorked);
            }
        }

        List<myEmployee> list = new ArrayList<>();
        for (Employee employee: eList) {
            list.add(new myEmployee(employee));
        }

        var comparator = new Comparator<myEmployee>() {

            @Override
            public int compare(myEmployee o1, myEmployee o2) {
                if (sortField.equals("name")){
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearsWorked-o2.yearsWorked;
            }
        };

        list.sort(comparator);

        for (myEmployee e: list) {
            System.out.println(e);
        }
    }

}


