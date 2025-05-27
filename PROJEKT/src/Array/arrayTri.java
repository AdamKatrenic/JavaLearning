package Array;

public class arrayTri {
    //public class CompareLength {
    //  public static void main(String[] args) {
    //    // - Create an array variable named firstArrayOfNumbers
    //    //   with the following content: [1, 2, 3]
    //    // - Create an array variable named secondArrayOfNumbers
    //    //   with the following content: [4, 5]
    //    // - Print "secondArrayOfNumbers is longer" if secondArrayOfNumbers
    //    // has more elements than firstArrayOfNumbers
    //    // - Otherwise print: "firstArrayOfNumbers is the longer one"
    //  }
    //}

    public static void main(String[] args) {
        int[] firstArrayOfNumbers = {1, 2, 3};
        int[] secondArrayOfNumbers = {4, 5};
        if (firstArrayOfNumbers.length > secondArrayOfNumbers.length){
            System.out.println("firstArrayOfNumbers is the longer one");

        }else {
            System.out.println("secondArrayOfNumbers is longer");
        }

    }

}
