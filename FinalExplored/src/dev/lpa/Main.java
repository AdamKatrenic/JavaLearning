package dev.lpa;

import consumer.specific.ChildClass;
import dev.lpa.generic.BaseClass;
import external.util.Logger;

public class Main {

    public static void main(String[] args) {

        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();
        BaseClass childRefferedToAsBase =  new ChildClass();

        parent.recommendedMethod();
        System.out.println("-".repeat(100));
        childRefferedToAsBase.recommendedMethod();
        System.out.println("-".repeat(100));
        child.recommendedMethod();

        System.out.println("-".repeat(100));

        parent.recommendedStatic();
        System.out.println("-".repeat(100));
        childRefferedToAsBase.recommendedStatic();
        System.out.println("-".repeat(100));
        child.recommendedStatic();

        System.out.println("-".repeat(100));

        BaseClass.recommendedStatic();
        ChildClass.recommendedStatic();

        String xArgument = "This is all I´ve got to say about Section ";
        StringBuilder zArgument = new StringBuilder("Only saying this: Section ");
        doXYZ(xArgument,16, zArgument);
        System.out.println("After Method, xArgument = " + xArgument);
        System.out.println("After Method, zArgument = " + zArgument);

        System.out.println("-".repeat(100));

        StringBuilder tracker = new StringBuilder("Step 1 is abc");
        Logger.logToConsole(tracker.toString());
        tracker.append(", Step 2 is xyz.");
        Logger.logToConsole(tracker.toString());
        System.out.println("After logging, tracker = " + tracker);


    }

    private static void doXYZ (String x, int y, final StringBuilder z) {

        final String c = x+y;
        System.out.println("c = " + c);
        x = c;
        z.append(y);
//        z = new StringBuilder("This is a new reference");
    }


}
