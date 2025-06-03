package dev.lpa;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Task> tasks = TaskData.getTasks("all");
        sortAndPrint("All Tasks", tasks);

        Comparator<Task> sortByPriorityAnn = Comparator.comparing(Task::getPriority);
        Set<Task> annsTasks = TaskData.getTasks("Ann");
        sortAndPrint("Ann's Tasks", annsTasks, sortByPriorityAnn);

        Comparator<Task> sortByPriorityBob = Comparator.comparing(Task::getPriority);
        Set<Task> bobsTasks = TaskData.getTasks("Bob");
        sortAndPrint("Bob's Tasks", bobsTasks, sortByPriorityBob);

        Comparator<Task> sortByPriorityCarol = Comparator.comparing(Task::getPriority);
        Set<Task> carolsTasks = TaskData.getTasks("Carol");
        sortAndPrint("Carol's Tasks", carolsTasks, sortByPriorityCarol);

        List<Task> allAssignedTasks = new ArrayList<>();
        allAssignedTasks.addAll(TaskData.getTasks("Ann"));
        allAssignedTasks.addAll(TaskData.getTasks("Bob"));
        allAssignedTasks.addAll(TaskData.getTasks("Carol"));

        sortAndPrint("All Assigned Tasks (including duplicates)", allAssignedTasks);

        Set<Task> unitedTasks = new HashSet<>();
        unitedTasks.addAll(annsTasks);
        unitedTasks.addAll(bobsTasks);
        unitedTasks.addAll(carolsTasks);
        sortAndPrint("Tasksk that are assigned to at least one of three team members", unitedTasks);

        Set<Task> unassignedTasks = new HashSet<>();
        for (Task task : unitedTasks) {
            if (task.getStatus() == Status.IN_QUEUE) {
                unassignedTasks.add(task);
            }
        }
        sortAndPrint("Unassigned Tasks", unassignedTasks);


        List<Task> multiplayerTasks = new ArrayList<>();
        multiplayerTasks.addAll(TaskData.getTasks("Ann"));
        multiplayerTasks.addAll(TaskData.getTasks("Bob"));
        multiplayerTasks.addAll(TaskData.getTasks("Carol"));

        Set<Task> seenOnce = new HashSet<>();
        Set<Task> duplicates = new HashSet<>();

        for (Task task : multiplayerTasks) {
            if (!seenOnce.add(task)) {
                duplicates.add(task);
            }
        }

        sortAndPrint("Tasks assigned to multiple people", duplicates);
    }

    private static void sortAndPrint(String header, Collection<Task> collection) {
        sortAndPrint(header, collection, null);
    }

    private static void sortAndPrint(String header, Collection<Task> collection,
                                     Comparator<Task> sorter) {

        String lineSeparator = "_".repeat(90);
        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);

        List<Task> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);

    }

}
