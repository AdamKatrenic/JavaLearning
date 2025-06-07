package dev.lpa;

import consumer.specific.ChildClass;
import dev.lpa.generic.BaseClass;

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
    }
}
