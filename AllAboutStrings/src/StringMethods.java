public class StringMethods {

    public static void main(String[] args) {

        String birthdate = "29/01/2002";
        int startingIndex = birthdate.indexOf("2002");
        System.out.println("starting index = " + startingIndex);
        System.out.println("Birth year = " + birthdate.substring(startingIndex));

        System.out.println("Month = " + birthdate.substring(3,5));

        String newDate = String.join("/", "29","01","2002");
        System.out.println("newDate = " + newDate);

        newDate = "29";
        newDate = newDate.concat("/");
        newDate = newDate.concat("01");
        newDate = newDate.concat("/");
        newDate = newDate.concat("2002");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace("/", "-"));
        System.out.println(newDate.replace("2", "00"));

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8)); //indent pridava medzery
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
