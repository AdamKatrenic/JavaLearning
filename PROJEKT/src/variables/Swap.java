package variables;

public class Swap {
    //public class variables.Swap {
    //  public static void main(String[] args) {
    //    // variables.Swap the values of the variables without changing the following 2 lines of code
    //    int a = 123;
    //    int b = 526;
    //
    //    // Write your code here:
    //
    //    System.out.println(a);
    //    System.out.println(b);
    //  }
    //}

    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        int temp = a; //riadok uklada hodnotu a do temporary

        a = b; //tento riadok urciuje hodnotu acka becku
        b = temp; //priradzuje hotnotu temp (originalnemu acku) do becka
        System.out.println(a);
        System.out.println(b);

    }
}
