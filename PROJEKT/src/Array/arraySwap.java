package Array;

public class arraySwap {
    //public class SwapElements {
    //    public static void main(String[] args) {
    //        // - Create an array variable named orders
    //        //   with the following content: ["first", "second", "third"]
    //        // - Swap the first and the third element of orders programmatically
    //        // - Print the swapped array into the console:
    //        //   [third, second, first]
    //
    //
    //    }
    //}

    public static void main(String[] args) {
        String[] orders = {"first", "second" , "third"};
        String temp = orders[0];
        orders[0] = orders[2];
        orders[2] = temp;
        System.out.print("[");
        for (int i = 0; i < orders.length; i++) {
            System.out.print(orders[i] + ", ");
            
        }
        System.out.print("]");
    }
}
