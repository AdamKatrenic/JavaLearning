package StringBuilder;

import java.util.regex.Pattern;

public class SimpleReplace {
//    public class SimpleReplace {
//        public static void main(String... args){
//            String example = "In a dishwasher far, far away";
//
//            // Below is a famous sentence from the beginning of a famous movie, but it has a problem.
//            // Someone played a prank on us and replaced the word "galaxy" with "dishwasher".
//            // Please fix the sentence so that the code prints "In a galaxy far, far away" to the console
//
//            System.out.println(example);
//        }
//    }
public static void main(String[] args) {
    String example = "In a dishwasher far, far away";
    StringBuilder sb = new StringBuilder(example);
    System.out.println(Pattern.compile("dishwasher").matcher(sb).replaceAll("galaxy"));

}
}
