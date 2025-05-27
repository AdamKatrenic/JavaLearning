package StringBuilder;

import java.util.regex.Pattern;

public class UrlFixer {
//    public class UrlFixer {
//        public static void main(String... args) {
//            String url = "https//www.reddit.com/r/nevertellmethebots";
//
//            // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
//            // Also, the URL is missing a crucial component, find out what it is and insert it too!
//            // Try to solve it in more than one way using different String functions!
//
//            System.out.println(url);
//        }
//    }
public static void main(String[] args) {
String url = "https//www.reddit.com/r/nevertellmethebots";
StringBuilder sb = new StringBuilder(url);
sb.insert(5, ":");
    System.out.println(Pattern.compile("bots").matcher(sb).replaceAll("odds"));
}
}
