package Array;

public class arraySyntax {
    public static void main(String[] args) {
        //public class Arrays {
        //  public static void main(String[] args) {
        //    int[] numbers = {1, 2, 3, 6};
        //
        //    // Print the second element of the array
        //
        //
        //    // Print all elements of the array
        //
        //    }
        //  }
        //}


        // Array je kolekcia elementov
        // Element je potreba zadefinovat na zaciatku
        // Velkost je fixnuta
        // Cisla od zaciatku pocita od nuly


        int[] numbers = {1, 2, 3, 6};
        System.out.println(numbers[3]);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(",");
            System.out.print(numbers[i]);
            
        }


    }
}
